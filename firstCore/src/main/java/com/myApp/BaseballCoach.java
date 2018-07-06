package com.myApp;

public class BaseballCoach implements Coach {
    //define a private field or dependency
    private CoachService coachService;

    //define a constructor for dependency injection
    public BaseballCoach(CoachService coachService) {
        this.coachService = coachService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minut on training";
    }

    @Override
    public String getDailyFortune() {
        //use my coach service
        return coachService.getFortune();
    }
}
