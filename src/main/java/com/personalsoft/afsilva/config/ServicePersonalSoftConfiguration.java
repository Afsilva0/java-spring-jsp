package com.personalsoft.afsilva.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "service-personalsoft")
@Component
public class ServicePersonalSoftConfiguration {
    private String url;
    private String username;
    private String password;
}
