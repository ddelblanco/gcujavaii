package gcu.javaii.interfacesamples;

public class Laser {

    Position xy;
    double direction;
    int speed;

    public Laser(Position xy, double direction, int speed) {
        this.xy = xy;
        this.direction = direction;
        this.speed = speed;
    }

    public Position getXy() {
        return xy;
    }

    public void setXy(Position xy) {
        this.xy = xy;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "Laser - x:" + this.getXy().getX() + " y:" + this.getXy().getX()
                + " direction:" + this.getDirection() + " and speed:" + this.getSpeed();
    }
}
