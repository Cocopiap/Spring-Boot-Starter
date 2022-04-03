package com.demo.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties(StudentProperties.class)
@ConfigurationProperties(prefix = "school")
public class SchoolProperties {
    private KlassProperties klasses;
    private StudentProperties student;
}
