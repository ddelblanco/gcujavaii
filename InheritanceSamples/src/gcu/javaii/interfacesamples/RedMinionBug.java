package gcu.javaii.interfacesamples;

public class RedMinionBug implements Monster{

    private Position position;

    public RedMinionBug(Position position) {
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
        return new Laser(this.getPosition(),180, 10);
    }

    @Override
    public void xmove(){
        this.setPosition(new Position(position.x + defaultSpeed,position.y));
    }

    @Override
    public void minusxmove() {
        this.setPosition(new Position(position.x - defaultSpeed, position.y));
    }

    @Override
    public void descent(){
        while (this.position.y>0){
            this.position.y -= 1;
        }
    }

    @Override
    public int eliminate(){
        return 500;
    }
}
