package com.database.pumpkin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(value = {"com.database.pumpkin.mapper"})
@EnableTransactionManagement
public class PumpkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(PumpkinApplication.class, args);
    }

}
