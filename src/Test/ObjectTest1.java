package Test;

public class ObjectTest1 {
    public static void main(String[] args) {
        Integer[] list1={12,24,55,1};
        Double[] list2={12.4,24.0,55.2,1.0};
        int[] list3={1,2,3};
        printArry(list1);
        printArry(list2);
        //printArry(list3);  int是基本数据类型，不是一个类，要把int转换成Integer类
    }
    public static void printArry(Object list[]){
        for (Object o:list){
                    System.out.print(o+" ");
                    System.out.println();
        }
    }
}
