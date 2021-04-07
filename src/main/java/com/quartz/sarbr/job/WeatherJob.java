package com.quartz.sarbr.job;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.quartz.sarbr.constant.JobConst.CITY_CODE;
import static com.quartz.sarbr.weather.WeatherUtil.sendWeatherInfoToWX;

/**
 * @author : sarbr
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
@NoArgsConstructor
public class WeatherJob implements Runnable {

    @Override
    public void run(){
        sendWeatherInfoToWX(CITY_CODE);
    }

}