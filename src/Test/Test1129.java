package Test;

public class Test1129 {
    public static void main(String[] args) {
        Object circle1=new Circle1();
        Object circle2=new Circle1();
        System.out.println(circle1.equals(circle2));
    }
}
class Circle1{
    double radius;
    public boolean equals(Object circle){
        return this.radius==((Circle1)circle).radius;
    }
}
