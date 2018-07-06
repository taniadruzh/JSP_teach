package com.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoRunner {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //get the bean from spring container
        // try get by default name
        BoxCoach coach = context.getBean("boxCoach", BoxCoach.class);

        //call a method on the bean

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyFortuneWithFortune());
        System.out.println(coach.getEmail());

        //close the context
        context.close();
    }

}
