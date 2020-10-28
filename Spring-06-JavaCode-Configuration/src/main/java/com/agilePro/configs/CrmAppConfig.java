package com.agilePro.configs;

import com.agilePro.interfaces.Manager;
import com.agilePro.services.GroupMessaging;
import com.agilePro.services.PrivateMessaging;
import com.agilePro.services.PublicMessaging;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.agilePro")
@PropertySource("classpath:application.properties")
public class CrmAppConfig {


    @Bean
    public PublicMessaging publicMessaging(){
        return new PublicMessaging(manager());
    }
    //@Bean
    public PrivateMessaging privateMessaging(){
        return new PrivateMessaging();
    }
    //@Bean
    public Manager manager(){
        return  new GroupMessaging();
    }



}
