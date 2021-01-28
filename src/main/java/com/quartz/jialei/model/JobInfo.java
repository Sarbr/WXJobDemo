package com.quartz.jialei.model;

import com.quartz.jialei.App;
import lombok.Data;

/**
 * @author : sarbr
 * @Description : 指定配置文件中的 quartz 属性与这个 bean绑定(在启动类注入，不用加@Component和@ConfigurationProperties)
 * @date : 2019/7/2 10:55
 * @see App
 */
@Data
public class JobInfo {
    private String weiXinUrl;
    private String content;
    private String weather;
}
