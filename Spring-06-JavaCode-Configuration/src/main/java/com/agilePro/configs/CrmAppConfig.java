package com.agilePro.configs;

import com.agilePro.services.PrivateMessaging;
import com.agilePro.services.PublicMessaging;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.agilePro")
public class CrmAppConfig {

//    @Bean
//    public PublicMessaging publicMessaging(){
//        return new PublicMessaging();
//    }
//    @Bean
//    public PrivateMessaging privateMessaging(){
//        return new PrivateMessaging();
//    }

}
