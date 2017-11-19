package gcu.javaii.inheritancesamples;

public class Main {

    public static void main(String[] args) {
	    // Athlete
        Athlete genericAthlete = new Athlete("Rafa Nadal",false,182);
        genericAthlete.injure();
        System.out.println("Is " + genericAthlete.name + " injured?: " + genericAthlete.injured);
        genericAthlete.health();
        System.out.println("Is " + genericAthlete.name + " injured?: " + genericAthlete.injured);
        genericAthlete.eatABurger();
        genericAthlete.diet();
        System.out.println("Am I a cyclist?: " + (genericAthlete instanceof Cyclist));
        System.out.println();

        // Soccer Player
        SoccerPlayer messi = new SoccerPlayer("Lionel Messi", false, 190, "Forward");
        System.out.println("Is " + messi.name + " injured?: " + messi.injured);
        messi.health();
        System.out.println("Is " + messi.name + " injured?: " + messi.injured);
        messi.shoot();
        messi.fake_fault();
        for (int i=0; i<10; i++){
            messi.eatABurger();
        }
        System.out.println("I'm " + messi.name + " and I'm rich, so I can use surgery to lose weight");
        messi.weight = 180;
        messi.eatABurger();
        System.out.println("I'm " + messi.name + " and my position is: " + messi.position);
        // Note: This would produce a compile time error, because a Soccer Player will never be
        // a cyclist. It can be only used if it has sense.
        //System.out.println("Am I a cyclist?: " + (messi instanceof Cyclist));
        System.out.println();

        // Cyclist
        Cyclist alberto = new Cyclist("Alberto Contador", false, 140, "Specialized");
        alberto.fall();
        alberto.injure();
        System.out.println("Is " + alberto.name + " injured: " + alberto.injured);
        alberto.eatABurger();
        alberto.diet();
        alberto.extraEatABurger();
        alberto.extraDiet();
        System.out.println("Am I a cyclist?: " + (alberto instanceof Cyclist));

    }
}
