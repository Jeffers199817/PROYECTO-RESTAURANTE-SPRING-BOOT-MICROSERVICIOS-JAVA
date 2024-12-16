package com.milenyumsoft.restaurantemenu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("consumirApi")
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }

}
