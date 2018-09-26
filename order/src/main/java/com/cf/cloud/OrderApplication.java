package com.cf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@Configuration
@SpringBootApplication
public class OrderApplication {

    @Bean
    OAuth2RestTemplate oAuth2RestTemplate(OAuth2ClientContext clientContext, OAuth2ProtectedResourceDetails details){

        return new OAuth2RestTemplate(details, clientContext);
    }

//    @Bean
//    public ProtobufHttpMessageConverter protobufHttpMessageConverter() {
//        return new ProtobufHttpMessageConverter();
//    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
