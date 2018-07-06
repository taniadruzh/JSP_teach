package com.annotation.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class Config {

    public FortuneService fortuneServiceImp(){
        return  new FortuneSrviceImpl();
    }


    @Bean
    public  BoxCoach boxCoach(){
        return new BoxCoach(fortuneServiceImp());
    }
}
