package Six;

public class getPentagonalNumber1 {
    public static void main(String[] args) {
        int n = 100;
        wujiao(n);
    }
    public static void wujiao(int x) {
        for (int j = 1; j < x; j++) {
            final int NUMBER = 10;
            int a = j * (3 * j - 1) / 2;
            if (j % NUMBER == 0)
                System.out.println("     "+a);
            else
                System.out.print("     " +a);
        }

    }
}
