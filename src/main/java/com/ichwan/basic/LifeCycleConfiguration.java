package com.ichwan.basic;

import com.ichwan.basic.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Server server(){
        return new Server();
    }
}
