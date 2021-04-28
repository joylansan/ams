package com.joylansan.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.joylansan.server.mapper")

public class AmsApplication {

    public static void main(String[] args){
        SpringApplication.run(AmsApplication.class,args);
    }
}
