package com.myApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from spring container
        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        //close the context
        classPathXmlApplicationContext.close();
    }
}
