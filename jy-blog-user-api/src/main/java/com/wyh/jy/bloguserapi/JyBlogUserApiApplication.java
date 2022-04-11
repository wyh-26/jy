package com.wyh.jy.bloguserapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.wyh.jy.bloguserapi","com.wyh.jy.db"} )
@MapperScan("com.wyh.jy.db.mapper")

public class JyBlogUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyBlogUserApiApplication.class, args);
    }

}
