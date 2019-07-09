package com.quartz.jialei.job;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.config.JobConfig;
import com.quartz.jialei.weather.WeatherUtil;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import static com.quartz.jialei.constant.JobConst.*;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
@NoArgsConstructor
@JobConfig(jobGroup = "weather",jobName = "weatherJob")
public class WeatherJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        content.put(CONTENT, WeatherUtil.getWeather(jobDataMap.getString(CITYNAME)));
        json.put(MSGTYPE, MARKDOWN);
        json.put(MARKDOWN, content);
        HttpUtil.createPost( jobDataMap.getString(URL)).contentType("application/json").body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT).execute();
    }

}