package Test;

public class Test2 {
    public static void main(String[] args) {
        T t1=new T();
        T t2=new T();
        System.out.println("t1 i "+ t1.i+"and j="+ t1.j);
        System.out.println("t2 i "+ t2.i+"and j="+ t2.j);
    }
}
class T{
    static int i=0;
    int j=0;
    T(){
        i++;
        j=1;
    }
}
