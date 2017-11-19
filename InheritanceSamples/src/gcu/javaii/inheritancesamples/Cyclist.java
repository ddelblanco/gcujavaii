package gcu.javaii.inheritancesamples;

public class Cyclist extends Athlete{

    public String bicycle;

    public Cyclist(String name, boolean injured, long weight, String bicycle) {
        super(name, injured, weight);
        this.bicycle = bicycle;
    }

    @Override
    public void injure(){
        injured = false;
        System.out.println("I'm " + name + ", I can't be injured");
    }

    public void fall(){
        injured = false;
        System.out.println("I'm " + name + ", I can fall but I'm not hurt");
    }

    @Override
    public void eatABurger(){
        weight +=0;
        System.out.println("I'm " + name + ", I can't eat burgers, so I still have this weight:" + weight);
    }


    public void extraEatABurger(){
        System.out.println("Ok, ok... if you are sure of this...");
        super.eatABurger();
    }

    @Override
    public void diet(){
        weight -=0;
        System.out.println("I'm " + name + ", If I do diet I will disappear, so I still have this weight: " + weight);
    }

    public void extraDiet(){
        System.out.println("Ok, ok... if you are sure of this...");
        super.diet();
    }


}
