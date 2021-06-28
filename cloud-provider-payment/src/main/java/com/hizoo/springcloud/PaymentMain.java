package com.hizoo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 订单
 *
 * @author hizoo
 * @create 2021-06-23-15:27
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }
}
