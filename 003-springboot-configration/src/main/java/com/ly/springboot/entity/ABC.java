package com.ly.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties(prefix = "abc")
@Data
public class ABC {
    private String name;
    private String websit;
}
