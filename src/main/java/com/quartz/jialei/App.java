package com.quartz.jialei;

import com.quartz.jialei.model.JobInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * @author : sarbr
 * @Description : 启动类(排除数据源类，不使用数据库相关)
 * @date : 2019/7/2 9:25
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    /**
     * @author : sarbr
     * @Description : 指定配置文件中的 quartz 属性与这个 bean绑定(在启动类注入，不用加@Component和@ConfigurationProperties)
     * @date : 2019/7/9 9:54
     */
    @Bean
    @ConfigurationProperties(prefix = "quartz")
    public JobInfo connectionSettings(){
        return new JobInfo();

    }
}
