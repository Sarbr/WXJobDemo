package com.quartz.jialei;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.quartz.jialei.weather.Weather;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ApplicationTests {

    @Test
    public void contextLoads() {
        HttpResponse execute = HttpUtil
                .createGet("https://jisutqybmf.market.alicloudapi.com/weather/query?citycode=".concat("101030500"))
                .contentType("application/json")
                .header("Authorization","APPCODE 5b643a186bdc4043ac8322353b90908f")
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
        String body = execute.body();
        Weather weather = JSONUtil.toBean(body, Weather.class);

        System.out.println(weather.toString());

    }

}
