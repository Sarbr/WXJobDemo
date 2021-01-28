package com.quartz.jialei.job;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.model.JobInfo;
import com.quartz.jialei.weather.WeatherUtil;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.quartz.jialei.constant.JobConst.*;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
@NoArgsConstructor
public class WeatherJob implements Job {

    @Resource
    private JobInfo jobInfo;

    @Override
    public void run(){
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        content.put(CONTENT, WeatherUtil.getWeather(jobInfo.getWeather()));
        json.put(MSGTYPE, MARKDOWN);
        json.put(MARKDOWN, content);
        HttpUtil.createPost(jobInfo.getWeiXinUrl())
                .contentType("application/json")
                .body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
    }

    @Override
    public String jobGroup() {
        return "weather";
    }

    @Override
    public String jobName() {
        return "weatherJob";
    }

    @Override
    public String cron(){
        return "0 0 09 * * ?";
    }
}