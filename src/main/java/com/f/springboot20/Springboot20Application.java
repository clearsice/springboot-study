package com.f.springboot20;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Springboot20Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot20Application.class, args);
    }

}
