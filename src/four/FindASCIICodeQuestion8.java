package four;
import java.util.*;
public class FindASCIICodeQuestion8 {
    public static void main(String[] args) {

        int decimal, binary;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        decimal = input.nextInt();
        if(decimal >= 0 && decimal <= 127)
        {
            binary = (byte)decimal;
            System.out.printf("The chararter for ASCII code %d is %c", decimal, binary);//用%c直接输出的就是字符串
        }
        else
            System.out.println("Invalid Input");

        input.close();
    }
}


