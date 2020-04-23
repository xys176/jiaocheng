package Test;

public class Test1123 {
    public static void main(String[] args) {
        new A1();
        new B();
    }
}
class A1{
    int i=7;
    public A1(){
        setI(20);
        System.out.println("i from A is"+i);
    }
    public void setI(int i){
        this.i=2*i;
    }
}
class B extends A1{
    public B(){
        System.out.println("i from B is"+i);
    }
    public void setI(int i){
        this.i=i*3;
    }
}



public class Intertion{
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=1;i<N;i++){
            for (int j=1;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[j]=a[i];
        a[i]=t;

    }
}
