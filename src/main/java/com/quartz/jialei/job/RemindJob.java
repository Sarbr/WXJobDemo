package com.quartz.jialei.job;

import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.constant.JobConst;
import com.quartz.jialei.model.JobInfo;
import com.quartz.jialei.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.quartz.jialei.constant.JobConst.CONTENT;
import static com.quartz.jialei.constant.JobConst.WEI_XIN_URL;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
public class RemindJob implements Runnable {

    @Override
    public void run(){
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        JobInfo weiXinUrl = CacheService.getCache(WEI_XIN_URL);
        JobInfo job = CacheService.getCache(CONTENT);
        content.put(JobConst.CONTENT, UnicodeUtil.toString(job.getValue()));
        json.put(JobConst.MSGTYPE, JobConst.TEXT);
        json.put(JobConst.TEXT, content);
        HttpUtil.createPost(weiXinUrl.getValue())
                .contentType("application/json")
                .body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
    }
}