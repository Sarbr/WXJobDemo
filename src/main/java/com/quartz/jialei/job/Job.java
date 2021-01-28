package com.quartz.jialei.job;

public interface Job extends Runnable {

    String jobGroup();

    String jobName();

    String cron();

}