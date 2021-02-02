package com.quartz.jialei.config;

import com.quartz.jialei.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.quartz.jialei.constant.JobConst.*;
import static com.quartz.jialei.service.CacheService.createInfo;

@Component
@Slf4j
public class JobRunner implements CommandLineRunner {

    @Value("${open-url}")
    private String openUrl;

    @Override
    public void run(String... args) {
        CacheService.setCache(CITY_CODE, createInfo(CITY_CODE, "101030500", "城市区域代码"));
        CacheService.setCache(APP_CODE, createInfo(APP_CODE, "code", "阿里云服务的app code"));
        CacheService.setCache(CONTENT, createInfo(CONTENT, "下班打卡提醒", "下班时提醒的内容"));
        CacheService.setCache(WEI_XIN_URL, createInfo(WEI_XIN_URL, "url", "企业微信机器人"));
        CacheService.setCache(REMIND_JOB, createInfo(REMIND_JOB, "0 0 18 * * ?", "提醒信息job"));
        CacheService.setCache(WEATHER_JOB, createInfo(WEATHER_JOB, "0 0 9 * * ?", "早上天气job"));

        // 打开默认浏览器
        Runtime rt = Runtime.getRuntime();
        try {
            String runCmd = "rundll32 url.dll,FileProtocolHandler " + openUrl ;
            rt.exec(runCmd);
        } catch (IOException e) {
            try {
                String runCmd = "cmd /c start " + openUrl ;
                rt.exec(runCmd);
            } catch (IOException ex) {
                log.error("浏览器默认打开失败!{}",openUrl);
            }
        }
    }

}