package Ten;

public class TestMyInteger3 {
    public static void main(String[] args) {
        MyInteger3 number = new MyInteger3(3);
        MyInteger3 number1 = new MyInteger3(5);
        char[] a = {'1','2','3','4'};
        System.out.println("Even1: " + MyInteger3.isEven(number) + " Odd1: "
                + MyInteger3.isOdd(number) + " Prime1: " + MyInteger3.isPrime(number));
        System.out.println("Even2: " + MyInteger3.isEven(number) + " Odd2: "
                + MyInteger3.isOdd(number) + " Prime2: " + MyInteger3.isPrime(number));
        System.out.println("equals1: " + number.equals(3) + " equals2: " + number.equals(number1));
        MyInteger3.parseInt("1234");
        MyInteger3.parseInt(a);

    }
}
