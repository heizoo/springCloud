package com.hizoo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: hizoo
 * Date: 2021/6/28
 * Time: 22:09
 * Description: No Description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class,args);
    }
}
