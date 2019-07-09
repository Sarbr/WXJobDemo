package com.quartz.jialei.config;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JobConfig {

    public String jobName() default "";

    public String jobGroup() default "";
}
