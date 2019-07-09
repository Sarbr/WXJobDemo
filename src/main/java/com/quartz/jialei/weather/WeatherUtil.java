package com.quartz.jialei.weather;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@SuppressWarnings("Duplicates")
public class WeatherUtil {

    /**
     * @author : sarbr
     * @Description :  国外的接口  http://api.apixu.com/v1/forecast.json?key=d41eb19c8e944d8ca5054053191506&q=haidian
     *                 国内的接口 https://www.tianqiapi.com/api/?version=v1&&cityid=
     * @date : 2019/7/3 10:57
     */
    public static String getWeather(String cityName) {
        StringBuilder sb=new StringBuilder();
        try {
            HttpResponse execute = HttpUtil.createPost("https://www.tianqiapi.com/api/?version=v1&&cityid=".concat(cityName)).contentType("application/json").timeout(HttpRequest.TIMEOUT_DEFAULT).execute();
            String body = execute.body();
            Weather weather = JSONArray.parseObject(body,Weather.class);
            Weather.DataBean dataBean = weather.getData().get(0);
            List<Weather.DataBean.IndexBean> index = dataBean.getIndex();
            StringBuilder sb2=new StringBuilder();
            index.forEach(i->sb2.append("### <font color=\"warning\">").append(i.getTitle().replaceAll("<em>", "").replaceAll("</em>", "")).append(":").append(i.getDesc()).append("</font>").append("\n"));
            sb.append("# ").append("<font color=\"info\">").append(weather.getCity().concat(":")).append(dataBean.getWeek()).append(",").append(dataBean.getWea()).append("</font> \n")
                    .append("## ").append("<font color=\"comment\">".concat(weather.getUpdate_time())).append("</font> \n")
                    .append("## ").append("<font color=\"comment\">").append(dataBean.getTem2().concat("~").concat(dataBean.getTem1())).append("</font> \n")
                    .append(sb2.toString());
        } catch (Exception e) {
            log.error("加载文件出错"+e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String weather = getWeather("101010200");

        System.out.println(weather);
    }

}