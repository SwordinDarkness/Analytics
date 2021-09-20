package com.Analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class Analytics {


    public static void main(String[] args) {
        SpringApplication.run(Analytics.class, args);
    }


}