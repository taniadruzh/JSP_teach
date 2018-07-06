package com.myApp;

public class HockeyCoach implements Coach {

    @Override
    public String getDailyWorkout()
    {
        return "Spend 60 minutes on hockey training";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
