package com.quartz.jialei.job;

import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.constant.JobConst;
import com.quartz.jialei.model.JobInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
public class RemindJob implements Job {

    @Resource
    private JobInfo jobInfo;

    @Override
    public void run(){
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        content.put(JobConst.CONTENT, UnicodeUtil.toString(jobInfo.getContent()));
        json.put(JobConst.MSGTYPE, JobConst.TEXT);
        json.put(JobConst.TEXT, content);
        HttpUtil.createPost(jobInfo.getWeiXinUrl())
                .contentType("application/json")
                .body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT)
                .execute();
    }

    @Override
    public String jobGroup() {
        return "remind";
    }

    @Override
    public String jobName() {
        return "remindJob";
    }

    @Override
    public String cron(){
        return "0 0 18 * * ? ";
    }
}