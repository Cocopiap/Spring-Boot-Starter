package com.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Data
@ConfigurationProperties(prefix = "klass")
@Configuration
@EnableConfigurationProperties(KlassProperties.class)
public class KlassProperties {
    private List<StudentProperties> students;
}
