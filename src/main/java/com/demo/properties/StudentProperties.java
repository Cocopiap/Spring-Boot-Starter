package com.demo.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({StudentProperties.class})
@ConfigurationProperties(prefix = "student")
@Data
public class StudentProperties {
    private int id;
    private String name;
}
