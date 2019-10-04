package com.wudi.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SecurityResourceApp {
    public static void main(String[] args) {
        SpringApplication.run(SecurityResourceApp.class, args);
    }

    @RestController
    class ResourceController {

        @GetMapping("/")
        public String test(){
            return "OK! ";
        }

        @GetMapping("/view/ok")
        public String test1(){
            return "OK! view";
        }
    }
}
