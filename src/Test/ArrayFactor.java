package Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayFactor {
    private static long count=0L;
    public static void main(String[] args) {
        int[] num = init();
        String str="";
        //求20个数的组合个数
        count(0,str,num,20);
    }
    private static void count(int i, String str, int[] num,int n) {
        if(n==0){
            if(getSum(str)==810){
                count++;
                System.out.println(count);
            }
            return;
        }
        if(i==num.length){
            return;
        }
        count(i+1,str+num[i]+",",num,n-1);

        count(i+1,str,num,n);
    }
    private static int getSum(String str){
        int sum=0;
        String[] split = str.split(",");
        for(String s:split){
            sum=sum+Integer.valueOf(s);
        }
        return sum;
    }
    private static int[] init(){
        List temp=new ArrayList<Integer>();
        int[] ints=new int[80];
        int i=0;
        while (true){
            int r = (int) (Math.random()*100+1);
            if(r<81&&!temp.contains(r)){
                temp.add(r);
                ints[i++]=r;
            }
            if(ints[79]!=0){
                break;
            }
        }
        return ints;
    }
}


