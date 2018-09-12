package com.cn.client;

import com.cn.client.config.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ClientConfigApplication {



    @Autowired
    config config;

    public static void main(String[] args) {
        SpringApplication.run(ClientConfigApplication.class, args);
    }




    @RequestMapping(value = "/hi")
    public String hi() {
        return config.foo+" "+config.message;
    }

}
