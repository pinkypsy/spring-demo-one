package ua.alvin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseballCoach implements Coach {

   private FortuneService fortuneService;

//    public BaseballCoach(){}
@Autowired
    public BaseballCoach(@Qualifier("myFortune3")FortuneService fortuneService) {
    this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
