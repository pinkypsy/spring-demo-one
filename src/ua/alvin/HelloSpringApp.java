package ua.alvin;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("-------------------");
        Coach coach = context.getBean("baseballCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        System.out.println("-------------------");
        CricketCoach coach1 = context.getBean("cricketCoach",CricketCoach.class);

        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach1.getTeam());

        System.out.println("-------------------");

        Coach coach2 = context.getBean("trackCoach",Coach.class);

        System.out.println(coach2.getDailyFortune());

        context.close();
        // write your code here
    }

//
}
