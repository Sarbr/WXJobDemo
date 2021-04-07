package com.quartz.sarbr.config;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.VersionResourceResolver;

import javax.annotation.Resource;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer, WebMvcRegistrations {

    @Resource
    private ResourceProperties resourceProperties;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        final ResourceHandlerRegistration registration = registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        final ResourceProperties.Strategy strategy = resourceProperties.getChain().getStrategy();
        final ResourceProperties.Cache cache = resourceProperties.getCache();
        if (strategy.getContent().isEnabled()) {
            registration
                    .setCachePeriod((int) cache.getPeriod().getSeconds())
                    .resourceChain(true)
                    .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
        }
    }
}
