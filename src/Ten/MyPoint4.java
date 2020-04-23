package Ten;

public class MyPoint4 {
    private double x;
    private double y;
    public MyPoint4(double m,double n){
        x=m;
        y=n;
    }
    public MyPoint4(){
        x=0;
        y=0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(double m,double n){
        return Math.sqrt(m*m+n*n);
    }
    public double distance(MyPoint4 object2){
        return Math.sqrt((x-object2.x)*(x-object2.x)+
                (y-object2.y)*(y-object2.y));
    }
}
