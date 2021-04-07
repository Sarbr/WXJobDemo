package com.quartz.sarbr.config;

import com.quartz.sarbr.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.quartz.sarbr.constant.JobConst.*;
import static com.quartz.sarbr.service.CacheService.createInfo;

@Component
@Slf4j
public class JobRunner implements CommandLineRunner {

    @Value("${app-code}")
    private String appCode;

    @Value("${wei-xin-url}")
    private String url;

    private CronTaskRegistrar cronTaskRegistrar;

    private Map<String,Runnable> runnableMap;

    @Autowired
    public void setJobConfig(Map<String,Runnable> runnableMap, CronTaskRegistrar cronTaskRegistrar) {
        this.runnableMap = runnableMap;
        this.cronTaskRegistrar = cronTaskRegistrar;
    }

    @Override
    public void run(String... args) {
        CacheService.setCache(CITY_CODE, createInfo(CITY_CODE, "101030500", "城市区域代码"));
        CacheService.setCache(APP_CODE, createInfo(APP_CODE, appCode, "阿里云服务的app code"));
        CacheService.setCache(CONTENT, createInfo(CONTENT, "下班打卡提醒", "下班时提醒的内容"));
        CacheService.setCache(WEI_XIN_URL, createInfo(WEI_XIN_URL, url, "企业微信机器人"));
        CacheService.setCache(REMIND_JOB, createInfo(REMIND_JOB, "0 0 18 * * ?", "提醒信息job"));
        CacheService.setCache(WEATHER_JOB, createInfo(WEATHER_JOB, "0 0 9 * * ?", "早上天气job"));
        CacheService.setCache(CITY_CODE_AUTO, createInfo(CITY_CODE_AUTO, "101090801", "主动查询指定区域的天气(默认衡水)"));

        runnableMap.forEach((job, runnable) -> {
            if(REMIND_JOB.equals(job)){
                cronTaskRegistrar.addCronTask(runnable, CacheService.getCache(REMIND_JOB).getValue());
            }else{
                cronTaskRegistrar.addCronTask(runnable, CacheService.getCache(WEATHER_JOB).getValue());
            }
            log.info("{}启动完成",job);
        });
    }

}