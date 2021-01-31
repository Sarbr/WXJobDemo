package com.quartz.jialei.config;

import com.quartz.jialei.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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



        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(openUrl));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            try {
                String runCmd = "open -a Microsoft Edge " +openUrl ;
                Runtime rt = Runtime.getRuntime();
                rt.exec(runCmd);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}