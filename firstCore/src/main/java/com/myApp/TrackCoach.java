package com.myApp;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "a need more than one hour for training";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
