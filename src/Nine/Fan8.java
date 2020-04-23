package Nine;

public class Fan8 {
    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;
    private char speed=SLOW;
    private boolean on=false;
    private double radius=5;
    String color="blue";

    public String getColor() {
        return color;
    }

    public String getSpeed() {
        if (speed==1)
            return "SLOW";
        if(speed==2)
            return "MEDIUM";
        if(speed==3)
            return "FAST";
        else
            return "speed is wrong";
    }

    public boolean getOn(){
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        if(speed==1){
            this.speed = SLOW;}
        if (speed==2){
            this.speed=MEDIUM;}
        if (speed==3){
            this.speed=FAST; }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    Fan8(){
    }
    public String toString(Fan8 object1){
        if(object1.on){
            return "fan is on,color is "+object1.getColor()+" radius is "
                    +object1.getRadius()+" speed is "+object1.getSpeed();
        }
        else
            return"fan is off,color is "+object1.getColor()+" radius is "+object1.getRadius();
    }

}
