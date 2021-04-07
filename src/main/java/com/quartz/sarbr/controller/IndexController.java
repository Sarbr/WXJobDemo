package com.quartz.sarbr.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import com.quartz.sarbr.config.CronTaskRegistrar;
import com.quartz.sarbr.model.JobInfo;
import com.quartz.sarbr.service.CacheService;
import com.quartz.sarbr.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.quartz.sarbr.constant.JobConst.*;
import static com.quartz.sarbr.weather.WeatherUtil.sendWeatherInfoToWX;

@Controller
public class IndexController {

    @Resource
    private JobService jobService;

    @Resource
    private CronTaskRegistrar cronTaskRegistrar;

    private Map<String,Runnable> runnableMap;

    @Autowired
    public void setJobConfig(Map<String,Runnable> runnableMap) {
        this.runnableMap = runnableMap;
    }

    @GetMapping({"/index","/"})
    public String list(Model model){
        final List<JobInfo> list = jobService.list();
        model.addAttribute("list", list);
        return "index";
    }

    /**
     * https://www.cnblogs.com/sxw123/p/13847793.html
     */
    @PostMapping("/saveJob")
    @ResponseBody
    public JSON list(@RequestBody List<JobInfo> list){
        list.forEach(jobInfo -> {
            //更新配置信息
            CacheService.updateCache(jobInfo.getKey(), jobInfo);
            if(REMIND_JOB.equals(jobInfo.getKey())||WEATHER_JOB.equals(jobInfo.getKey())){
                Runnable job = runnableMap.get(jobInfo.getKey());
                cronTaskRegistrar.addCronTask(job,jobInfo.getValue());
            }
        });
        JSON json = new JSONObject();
        json.putByPath("msg","success");
        return json;
    }

    @GetMapping("/search")
    public String search(){
        sendWeatherInfoToWX(CITY_CODE_AUTO);
        return "index";
    }

}
