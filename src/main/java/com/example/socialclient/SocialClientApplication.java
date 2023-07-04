package com.example.socialclient;

import com.example.socialclient.common.ApiHelper;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SocialClientApplication {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @Bean
    public ApiHelper getApiHelper() {
        return new ApiHelper(getRestTemplate());
    }
    @Bean
    public Gson getGson(){
        return new Gson();
    }
    public static void main(String[] args) {
        SpringApplication.run(SocialClientApplication.class, args);
    }

}
