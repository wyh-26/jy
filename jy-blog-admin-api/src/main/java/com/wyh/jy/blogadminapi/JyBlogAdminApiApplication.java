package com.wyh.jy.blogadminapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.wyh.jy.db","com.wyh.jy.blogadminapi"})
@MapperScan("com.wyh.jy.db.mapper")
@EnableTransactionManagement
@EnableScheduling

public class JyBlogAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyBlogAdminApiApplication.class, args);
    }

}
