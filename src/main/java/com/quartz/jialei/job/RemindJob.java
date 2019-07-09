package com.quartz.jialei.job;

import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.quartz.jialei.config.JobConfig;
import com.quartz.jialei.constant.JobConst;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 10:56
 */
@Component
@Slf4j
@NoArgsConstructor
@JobConfig(jobGroup = "remind",jobName = "remindJob")
public class RemindJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        JSONObject json=new JSONObject();
        JSONObject content = new JSONObject();
        content.put(JobConst.CONTENT, UnicodeUtil.toString(jobDataMap.getString(JobConst.CONTENT)) );
        json.put(JobConst.MSGTYPE, JobConst.TEXT);
        json.put(JobConst.TEXT, content);
        HttpUtil.createPost( jobDataMap.getString(JobConst.URL)).contentType("application/json").body(json)
                .timeout(HttpRequest.TIMEOUT_DEFAULT).execute();
    }
}