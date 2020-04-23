package Nine;

public class Rectangle1 {
    double width=1;
    double height=1;
    public Rectangle1(){
    }
    public Rectangle1(double width,double height){
        this.width=width;
        this.height=height;
    }
    double getAread(double width,double  height){
        return width*height;
    }
    double getPeHmeter(double width,double height){
        return 2*(width+height);
    }
}
