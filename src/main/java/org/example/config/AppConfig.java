package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages =  {
        "org.example.controller.web","org.example.service.prefix","org.example.repository.database"
})
@PropertySource("classpath:application.properties")
public class AppConfig {

}
