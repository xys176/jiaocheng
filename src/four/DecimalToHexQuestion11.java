package four;

import java.util.*;

public class DecimalToHexQuestion11 {
    public static void main(String[] args) {
        int deciNum;

        System.out.print("Enter a decimal value (0 to 15): ");
        Scanner input = new Scanner(System.in);
        deciNum = input.nextInt();

        if(0 <= deciNum && deciNum <= 9)
            System.out.println("The hex value is " + deciNum);
        else if(10 <= deciNum && deciNum <= 15)
            System.out.printf("The hex value is %c", (deciNum - 10 + 'A'));//%c直接输出字符
        else
            System.out.println(deciNum + " is an invalid input");

        input.close();
    }
}
