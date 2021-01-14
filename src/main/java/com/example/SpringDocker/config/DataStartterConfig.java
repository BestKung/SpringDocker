package com.example.SpringDocker.config;

import com.example.SpringDocker.bean.DataStart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class DataStartterConfig {

    @Bean
    public DataStart dataStart() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return new DataStart(uuid);
    }
}
