package com.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("sillyCoach")
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }



    public TennisCoach() {
        System.out.println("inside default constructor");
    }


   @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setter");
        this.fortuneService = fortuneService;
    }

    //try autowired method?
    //try autowire field?
    // try use Qualifers if interfase have more than ona implementations
    // try use Scope
    //try use PostConstruct and PreDestroy

    @Override
    public String getDailyFortune() {
        return "tennis coach teach play in tennis";
    }

    @Override
    public String getDailyFortuneWithFortune() {
        return fortuneService.getFortune();
    }
}
