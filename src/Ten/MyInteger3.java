package Ten;

public class MyInteger3 {
        private int value;
        MyInteger3 (int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
        public boolean isEven(int value){  // 偶数
            return value % 2 == 0;
        }
        public boolean isOdd(int value){
            return value % 2 == 1;
        }
        public boolean isPrime(int value){
            int i;
            boolean R = false;
            if(value > 1){
                for( i = 2;i<=getValue();i++){
                    if(getValue() % i == 0 && i == getValue())
                        R = true;
                    else
                        R = false;
                }
                return R;
            }
            else
                return R;
        }
        public static boolean isEven(MyInteger3 integer){
            return integer.getValue() % 2 == 0;
        }
        public static boolean isOdd(MyInteger3 integer){
            return integer.getValue() % 2 == 1;
        }
        public static boolean isPrime(MyInteger3 integer){
            int i;
            boolean R = false;
            if(integer.getValue() > 1){
                for( i = 2;i <= integer.getValue();i++){
                    if(integer.getValue() % i == 0 && i ==integer.getValue())
                        R = true;
                    else
                        R = false;
                }
                return R;
            }
            else
                return R;
        }
        public boolean equals(int value){
            return this.value == value;
        }
        public boolean equals(MyInteger3 integer){
            return this.value == integer.getValue();
        }
        public static void parseInt(char[] a){
            String str = String.valueOf(a);
            System.out.println("字符数组转整数："+ Integer.parseInt(str));
        }
        public static void parseInt(String c){
            System.out.println("字符串转整数："+ Integer.parseInt(c));
        }

}
