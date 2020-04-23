package Ten;

public class TestMyPoint4 {
    public static void main(String[] args) {
        MyPoint4 p1=new MyPoint4(0,0);
        MyPoint4 p2=new MyPoint4(10,30.5);
        System.out.println("p1与p2之间的距离是"+p1.distance(p2));
    }
}
