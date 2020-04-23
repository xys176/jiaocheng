package Five;

public class FindNumbersDivisibleBy5Or6ButNotBothQuestion11 {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<201;i++){
            if(i%5==0^i%6==0){   //^异或运算符，相同为假，不同为真，在这里就是有一个能成立则为真，
                                 // 两个都成立或是两个都为假则不成立
                System.out.printf("%d ",i);
                count++;
                if(count%10==0)
                    System.out.printf("\n");
            }
        }
    }
}
