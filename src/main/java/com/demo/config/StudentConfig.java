package com.demo.config;

import com.demo.properties.SchoolProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SchoolProperties.class)
@ConditionalOnProperty(prefix = "student",name = "isopen",havingValue = "ture")

public class StudentConfig {
}
