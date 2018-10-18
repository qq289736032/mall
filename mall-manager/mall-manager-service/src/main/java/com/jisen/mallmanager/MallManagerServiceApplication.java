package com.jisen.mallmanager;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.CountDownLatch;

@MapperScan(value = "com.jisen.mallmanager.mapper")
@SpringBootApplication
@EnableDubbo
@PropertySource("classpath:conf/conf.properties")
public class MallManagerServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        new SpringApplicationBuilder()
                .sources(MallManagerServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
//        CountDownLatch countDownLatch = new CountDownLatch(1);
//        countDownLatch.await();
    }
}
