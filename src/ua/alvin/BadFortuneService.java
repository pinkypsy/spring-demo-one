package ua.alvin;

public class BadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Better luck next time!";
    }
}
