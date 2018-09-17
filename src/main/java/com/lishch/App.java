package com.lishch;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishch.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}