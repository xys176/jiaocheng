package Nine;

public class TestFan8 {
    public static void main(String[] args) {
        Fan8 object1=new Fan8();
        Fan8 object2=new Fan8();
        object1.setColor("yellow");
        object1.setRadius(10);
        object1.setSpeed(3);
        object1.setOn(true);
        object2.setColor("blue");;
        object2.setRadius(5);;
        object2.setSpeed(2);
        object2.setOn(true);
        System.out.println(""+object1.toString(object1));
        System.out.println(""+object2.toString(object2));
    }
}
