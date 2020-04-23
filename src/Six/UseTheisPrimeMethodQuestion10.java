package Six;

public class UseTheisPrimeMethodQuestion10 {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<10000;i++){  //要从2开始，要不然会多两个
            if(isPrime(i))
                count++;
        }
          System.out.printf("小于10000的素数有%d个",count);
    }
    public static boolean isPrime(int n){
        for(int x=2;x<=n/2;x++){
            if(n%x==0)
                return false;      //能被整除说明不是素数，返回false
        }
        return true;               //不能被任何一个小于这个数一半的数整除，
                                   // 说明这个数是素数，返回true，计数器count加一
    }
}
