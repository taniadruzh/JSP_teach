package com.myApp;

public class CricketCoach implements Coach {

    private String email;
    private String age;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private CoachService coachService;

    public CricketCoach() {
        System.out.println("no arg constructor");
    }



    public void setCoachService(CoachService coachService) {
        System.out.println("setter method");
        this.coachService = coachService;
    }

    @Override
    public String getDailyWorkout() {
        return age+" -> "+email;
    }

    @Override
    public String getDailyFortune() {
        return coachService.getFortune();
    }
}
