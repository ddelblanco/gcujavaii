package gcu.javaii.inheritancesamples;

public class SoccerPlayer extends Athlete {

    public String position;

    public SoccerPlayer(String name, boolean injured, long weight, String position) {
        super(name, injured, weight);
        this.position = position;
    }

    public void shoot(){
        System.out.println("I'm " + name + " and I almost score!!!");
    }

    public void fake_fault(){
        System.out.println("I'm " + name + " and... Oh... Referee...he almost killed me");
    }

}
