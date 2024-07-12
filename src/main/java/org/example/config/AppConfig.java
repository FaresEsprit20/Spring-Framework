package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  {
        "org.example.controller.web","org.example.service.prefix","org.example.repository.database"
})
public class AppConfig {

}
