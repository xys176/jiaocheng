package Cone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class n12conbunationSum {

    public static int[] a;
    public static int[] b;
    public static int c=0;
    public static int N=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        a=new int[N];
        b=new int[N];
        int total=0;
        int j=0;
        if(N<=0)
            return;
        int x=0;
        while(x<N){
            a[x]=x+1;
            x++;
        }

        c=N;

        removeDuplicate();
        fun(0,new ArrayList<Integer>(),0,total);
        System.out.println("total is"+total);
    }
    /**
     * 数据去重
     */
    private static void removeDuplicate() {
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<N-1;i++){
            if(a[i]!=a[i+1]){
                b[j++]=a[i];
            }
        }
        b[j]=a[N-1];

    }
    /**
     * dfs
     */
    private static void fun(int d,  List<Integer> conbu,int sum,int total) {
        int coun=total;
        if(sum==c){
            for(Integer i:conbu){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=d;i<N;i++){
            if(c<sum+b[i]){
                break;
            }
            conbu.add(b[i]);
            fun(i,conbu,sum+b[i],total);
            conbu.remove(conbu.size()-1);
        }
    }

}


