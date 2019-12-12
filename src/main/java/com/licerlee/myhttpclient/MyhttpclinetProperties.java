package com.licerlee.myhttpclient;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "myhttpclient")
public class MyhttpclinetProperties {

    // 如果配置文件中配置了http.url属性，则该默认属性会被覆盖
    private String url = "http://www.baidu.com/";

}
