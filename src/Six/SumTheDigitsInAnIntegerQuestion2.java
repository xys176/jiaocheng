package Six;

import java.util.Scanner;

public class SumTheDigitsInAnIntegerQuestion2 {
    public static void main(String[] args) {
        long number;
        Scanner intput=new Scanner(System.in);
        System.out.println("输入一个数：");
        number=intput.nextLong();
        System.out.printf("这个数的各个位的数字之和是%d",sumNumber(number));
    }
    public static int sumNumber(long n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        return sum;
    }
}
