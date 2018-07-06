package com.annotation.demo;


import org.springframework.beans.factory.annotation.Value;

public class BoxCoach implements Coach {


    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private FortuneService fortuneService;


    public BoxCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }



    @Override
    public String getDailyFortune() {
        return "box coach can fight";
    }

    @Override
    public String getDailyFortuneWithFortune() {
        return fortuneService.getFortune();
    }
}
