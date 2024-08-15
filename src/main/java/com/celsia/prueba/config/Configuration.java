package com.celsia.prueba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@org.springframework.context.annotation.Configuration
public class Configuration {
     @Bean
    WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@SuppressWarnings("null") CorsRegistry corsRegistry) {
                corsRegistry.addMapping("/**")
                        .allowedOrigins("*")// Solo en pruebas
                        .allowedMethods("GET", "POST", "DELETE");
            }
        };
    }
}
