package com.non.blocking.config;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataFakeConfig {

    @Bean
    public Faker faker(){
      return new Faker();
    }

}
