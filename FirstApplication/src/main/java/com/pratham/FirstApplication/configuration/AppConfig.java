package com.pratham.FirstApplication.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pratham.FirstApplication.DB;
import com.pratham.FirstApplication.DevDB;
import com.pratham.FirstApplication.ProdDB;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDataBean() {
        return (DB) new ProdDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public static DB getDevDataBean() {
        return (DB) new DevDB();
    }
}
