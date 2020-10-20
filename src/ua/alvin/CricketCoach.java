package ua.alvin;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String team;


    @Override
    public String getDailyWorkout() {
        return "Cricket workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public CricketCoach() {
        System.out.println("cricket no-arg constr");
    }


    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    public String getTeam() {
        return team;
    }
}
