package Test;
import java.math.*;

public class Test5 {
    public static void main(String[] args) {
      System.out.println("50! is"+factorial(50));
    }
    public static BigInteger factorial(long n){
        BigInteger result=new BigInteger("1");
        for (int i=1;i<=n;i++){
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}
