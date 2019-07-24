package com.hgf.serverconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// 支持服务注册发现
@EnableDiscoveryClient
public class ServerConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsulApplication.class, args);
    }

}
