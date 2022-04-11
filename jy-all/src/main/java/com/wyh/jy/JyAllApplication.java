package com.wyh.jy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wyh.jy"})
@MapperScan("com.wyh.jy.db.mapper")
public class JyAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyAllApplication.class, args);
    }

}
