package com.licerlee.myhttpclient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyhttpclinetProperties.class)
public class MyhttpclientAutoConfiguration {

    private final MyhttpclinetProperties properties;

    public MyhttpclientAutoConfiguration(MyhttpclinetProperties properties) {
        this.properties = properties;
    }


    /**
     * 在Spring上下文中创建一个对象
     */
    @Bean
    @ConditionalOnMissingBean
    public Myhttpclinet init() {
        Myhttpclinet client = new Myhttpclinet();
        String url = properties.getUrl();
        client.setUrl(url);
        return client;
    }
}
