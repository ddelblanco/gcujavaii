package gcu.javaii.inheritancesamples;

public class Athlete {

    public String name;
    public boolean injured;
    public long weight;


    public Athlete(String name, boolean injured, long weight) {
        this.name = name;
        this.injured = injured;
        this.weight = weight;
    }

    public void injure(){
        injured = true;
        System.out.println("I'm " + name + " and I'm injured");
    }

    public void health(){
        injured = false;
        System.out.println("I'm " + name + " and I'm healthy");
    }

    public void eatABurger(){
        weight +=1;
        System.out.println("I'm " + name + " and this is yummy, but now I weight: " + weight);
    }

    public void diet(){
        weight -=1;
        System.out.println("I'm " + name + " and I'm starving, but now I weight: " + weight);
    }
}
