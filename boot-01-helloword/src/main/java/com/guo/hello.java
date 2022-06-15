package com.guo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class hello {
    public static void main(String[] args) {
        /*ioc容器*/
        ConfigurableApplicationContext run = SpringApplication.run(hello.class, args);

    }

}
