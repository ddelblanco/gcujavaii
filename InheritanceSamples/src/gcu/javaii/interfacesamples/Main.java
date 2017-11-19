package gcu.javaii.interfacesamples;

public class Main {

    public static void main(String[] args) {
        Monster monster;
        Fighter fighter = new Fighter(new Position(50,10));

        if (args[0].equals("yellow")){
            monster= new YellowMinionBug(new Position(250,250));
        }else{
            monster= new RedMinionBug(new Position(100,100));
        }

        System.out.println(monster.getPosition());
        monster.xmove();
        System.out.println(monster.getPosition());
        monster.minusxmove();
        System.out.println(monster.getPosition());
        Laser laser = monster.shoot(fighter);
        System.out.println(laser);
        monster.descent();
        System.out.println(monster.getPosition().toString());
        int score = monster.eliminate();
        System.out.println("Destroyed! This is the score: " + score);

    }
}
