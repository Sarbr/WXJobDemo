package com.quartz.jialei.job;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.model.JobInfo;
import com.quartz.jialei.service.CacheService;
import com.quartz.jialei.weather.WeatherUtil;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class WeatherJob implements Runnable {

    @Override
    public void run(){
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        JobInfo cityCode = CacheService.getCache(CITY_CODE);
        JobInfo appCode = CacheService.getCache(APP_CODE);
        JobInfo weiXinUrl = CacheService.getCache(WEI_XIN_URL);
        content.put(CONTENT, WeatherUtil.getWeather(cityCode.getValue(), appCode.getValue()));
        json.put(MSGTYPE, MARKDOWN);
        json.put(MARKDOWN, content);
        HttpUtil.createPost(weiXinUrl.getValue())
                .contentType("application/json")
                .body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
    }

}