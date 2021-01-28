package com.quartz.jialei.config;

import com.quartz.jialei.job.Job;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.util.List;

@Configuration
@EnableScheduling
@Slf4j
public class JobConfig implements SchedulingConfigurer {

    private List<Job> runnableList;

    @Autowired
    public void setJobConfig(List<Job> runnableList) {
        this.runnableList = runnableList;
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar registrar) {
        runnableList.forEach(runnable -> {
            registrar.addTriggerTask(runnable,
                    triggerContext -> new CronTrigger(runnable.cron()).nextExecutionTime(triggerContext));
        });
        log.info("初始化定时任务完成,共[{}]个定时任务!",runnableList.size());
    }
}
