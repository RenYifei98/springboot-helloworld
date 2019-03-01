package com.example.springboothelloworld;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {

        System.out.println("Hello world");
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

}
