package four;
import java.util.*;

public class ProcessStringQuestion20 {
    public static void main(String[] args) {
        String string;

        Scanner input = new Scanner(System.in);
        string = input.nextLine();

        if(string.length() == 0)
            System.exit(1);

            System.out.println("Its length is " + string.length());
            System.out.println("Its first character is " + string.charAt(0));

        input.close();
    }
}
