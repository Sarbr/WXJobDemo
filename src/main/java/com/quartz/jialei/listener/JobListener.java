package com.quartz.jialei.listener;

import com.quartz.jialei.config.JobConfig;
import com.quartz.jialei.constant.JobConst;
import com.quartz.jialei.job.RemindJob;
import com.quartz.jialei.job.WeatherJob;
import com.quartz.jialei.model.JobInfo;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author : sarbr
 * @Description : TODO
 * @date : 2019/7/2 9:58
 */
@Slf4j
@Configuration
@WebListener
public class JobListener implements ServletContextListener {


    /**加入Qulifier注解，通过名称注入bean*/
    @Autowired
    @Qualifier("Scheduler")
    private Scheduler scheduler;
    @Autowired
    JobInfo jobInfo;
    /*@Value("${quartz.weiXinUrl}")
    String url;
    @Value("${quartz.cronExpression}")
    String cronExpression;*/

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        try {
            addCronJob(WeatherJob.class,jobInfo.getWeatherExpression(),jobInfo.getWeiXinUrl(),"",jobInfo.getWeather());
            addCronJob(RemindJob.class,jobInfo.getCronExpression(),jobInfo.getWeiXinUrl(),jobInfo.getContent(),"");
        }catch (Exception e){
            log.error("初始化定时任务失败" + e);
        }
    }
    public synchronized void addCronJob(Class<? extends Job> clazz,String expression,String url,String content,String cityName) throws Exception {
        // 启动调度器
        scheduler.start();
        JobConfig annotation = clazz.getAnnotation(JobConfig.class);
        //构建job信息
        JobDetailImpl jobDetail =(JobDetailImpl)JobBuilder.newJob(clazz).build();
        //表达式调度构建器(即任务执行的时间)
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(expression);
        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().
                withSchedule(scheduleBuilder).forJob(annotation.jobName(), annotation.jobGroup())//这里会存储key
                .build();
        JobDataMap jobDataMap=new JobDataMap();
        jobDataMap.put(JobConst.URL, url);
        jobDataMap.put(JobConst.CONTENT, content);
        jobDataMap.put(JobConst.CITYNAME, cityName);
        jobDetail.setJobDataMap(jobDataMap);
        jobDetail.setKey(trigger.getJobKey());//不一样会导致报错，这里重新设置一样的
        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            log.error("创建定时任务失败" + e);
            throw new Exception("创建定时任务失败");
        }
    }
}
