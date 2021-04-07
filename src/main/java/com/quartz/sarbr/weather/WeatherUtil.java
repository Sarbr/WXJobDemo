package com.quartz.sarbr.weather;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.quartz.sarbr.model.JobInfo;
import com.quartz.sarbr.service.CacheService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.quartz.sarbr.constant.JobConst.*;

@Slf4j
@SuppressWarnings("Duplicates")
public class WeatherUtil {

    public static void sendWeatherInfoToWX(String cityCodeAuto) {
        JSONObject body = new JSONObject();
        JSONObject content = new JSONObject();
        JobInfo cityCode = CacheService.getCache(cityCodeAuto);
        JobInfo appCode = CacheService.getCache(APP_CODE);
        JobInfo weiXinUrl = CacheService.getCache(WEI_XIN_URL);
        content.put(CONTENT, getWeather(cityCode.getValue(), appCode.getValue()));
        body.put(MSGTYPE, MARKDOWN);
        body.put(MARKDOWN, content);
        HttpUtil.createPost(weiXinUrl.getValue())
                .contentType("application/json")
                .body(body)
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
    }

    public static String getWeather(String cityCode, String appCode) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try {
            HttpResponse execute = HttpUtil
                    .createGet("https://jisutqybmf.market.alicloudapi.com/weather/query?citycode=".concat(cityCode))
                    .contentType("application/json")
                    .header("Authorization", "APPCODE ".concat(appCode))
                    .timeout(HttpRequest.TIMEOUT_DEFAULT)
                    .execute();
            String body = execute.body();
            Weather weather = JSONUtil.toBean(body, Weather.class);
            if (!"ok".equals(weather.getMsg())) {
                return "none";
            }
            final Weather.ResultBean result = weather.getResult();
            final List<Weather.ResultBean.IndexBean> indexBeanList = result.getIndex();
            for (Weather.ResultBean.IndexBean indexBean : indexBeanList) {
                sb2.append("### <font color=\"warning\">").append(indexBean.getIname()).append(":").append(indexBean.getDetail()).append(indexBean.getIvalue()).append("</font>").append("\n");
            }
            sb.append("# ").append("<font color=\"info\">").append(result.getCity().concat(":")).append(result.getWeek()).append(",气温:").append(result.getTemp()).append(",最高气温:").append(result.getTemphigh()).append(",最低气温:").append(result.getTemplow()).append(result.getWeather()).append(",湿度:").append(result.getHumidity()).append(",气压:").append(result.getPressure()).append("</font> \n")
               .append("## ").append("<font color=\"comment\">".concat(result.getUpdatetime())).append("</font> \n")
                    .append("## ").append("<font color=\"comment\">").append(result.getWinddirect().concat("~").concat(result.getWindpower())).append("</font> \n")
                    .append(sb2.toString());
        } catch (Exception e) {
            log.error("加载文件出错" + e);
        }
        return sb.toString();
    }
}