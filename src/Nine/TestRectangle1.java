package Nine;

public class TestRectangle1 {
    public static void main(String[] args) {
        Rectangle1 object1=new Rectangle1(4,40);
        Rectangle1 object2=new Rectangle1(3.5,35.9);
        System.out.println("第一个矩形的宽是"+object1.width+"高是"+object1.height+"面积是"
                +object1.getAread(4,40)+"周长是"
                +object1.getPeHmeter(4,40));
        System.out.println("第二个矩形的宽是"+object2.width+"高是"+object2.height+"面积是"
                +object2.getAread(3.5,35.9)+"周长是"
                +object2.getPeHmeter(3.5,35.9));
    }
}
