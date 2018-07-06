package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfiguration.xml");

        //get the bean from spring container
      // try get by default name
        Coach coach = context.getBean("sillyCoach", Coach.class);

        //call a method on the bean

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyFortuneWithFortune());

        //close the context
        context.close();
    }
}
