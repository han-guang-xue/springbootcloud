package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RibbonServer {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServer.class,args);
    }

    @Bean
    @LoadBalanced //负载均衡注解
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}