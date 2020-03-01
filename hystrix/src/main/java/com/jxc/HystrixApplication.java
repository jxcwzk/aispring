package com.jxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
//声明启用数据监控
@EnableHystrixDashboard
//声明启用可是化数据监控

public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}

//启动成功后访问“http://localhost:8060/hystrix”，查询“http://localhost:8060/actuator/hystrix.stream”获取当前控制面板
