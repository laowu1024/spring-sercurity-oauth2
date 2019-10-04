package com.wudi.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wudi.oauth2.mapper")
public class SecurityServerApp {
    public static void main(String[] args) {
        SpringApplication.run(SecurityServerApp.class, args);
    }
}
