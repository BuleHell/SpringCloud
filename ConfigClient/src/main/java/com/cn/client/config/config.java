package com.cn.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Value("${foo}")
    public  String foo;

    @Value("${democonfigclient.message}")
    public  String message;
}
