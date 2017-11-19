package gcu.javaii.interfacesamples;


public class YellowMinionBug implements Monster{

    private Position position;

    public YellowMinionBug(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Laser shoot(Fighter fighter){
        return new Laser(this.getPosition(),calculateFighterDirection(fighter), 15);
    }

    @Override
    public void xmove(){
        this.setPosition(new Position(position.x + defaultSpeed,position.y-1));
    }

    @Override
    public void minusxmove() {
        this.setPosition(new Position(position.x - defaultSpeed, position.y-1));
    }

    @Override
    public void descent(){
            this.position.y -= 5;
    }

    @Override
    public int eliminate(){
        return 1000;
    }

    double calculateFighterDirection(Fighter fighter){
        //Let's calculate the direction to shoot
        double angle = Math.toDegrees(Math.atan2(this.position.x - fighter.getXy().x, this.position.y - fighter.getXy().y));
        // Keep angle between 0 and 360
        angle = angle + Math.ceil( -angle / 360 ) * 360;
        return angle;
    }

}
