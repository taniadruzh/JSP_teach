package com.myApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");


        //retrieve bean from spring container
        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach coach2 = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        //call methods on the bean

        System.out.println("-----------");
        boolean result = coach.equals(coach2);
        System.out.println(result);
        System.out.println(coach);
        System.out.println(coach2);
        //close the context
        classPathXmlApplicationContext.close();
    }
}
