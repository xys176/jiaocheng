package Cone;
import java.util .Scanner;
public class SubtractionQuiz {
    public static void main(String[] args) {
        int numberl = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 50);
        if (numberl < number2) {
            int temp = numberl;
            numberl = number2;
            number2 = temp;
            System.out.print
                    ("What is " + numberl + " - " + number2 + " ?");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (numberl - number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong.");
                System.out.println(numberl + "- " + number2 + " should be " + (numberl - number2));
            }
        }
    }
}
