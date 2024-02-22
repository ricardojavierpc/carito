package com.ecommerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CaritoApplication {

    public static void main(String[] args) {

        SpringApplication.run(CaritoApplication.class, args);

    }
}


