package Cone;

import java.util.Scanner;

public class MinimumResult {
    public static void main(String[] args) {
        int[][] dp = new int[200][200];
        int[][] number = new int[200][200];
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str1 = s.split("");
        Scanner in1=new Scanner(System.in);
        int n=in.nextInt();
        System.out.printf("%d\n",DP(s.length(),n,dp,number,str1));
    }
    public static int DP(int x, int y,int dp[][],int number1[][],String str1[]){
        if(dp[x][y]!=1){
            return dp[x][y];
        }
        if (y==0){
            dp[x][0]=number(0,x,dp,number1,str1);
            return dp[y][0];
        }
        dp[x][y]=Float.MAX_EXPONENT;
        for(int k=x-1;k>=y;k--)
        {
            dp[x][y]=min(dp[x][y],DP(k,y-1,dp,number1,str1)+number(k,x,dp,number1,str1));
        }
        return dp[x][y];
    }
    public static int min(int a,int b){
        if (a>b)
            return b;
        else
            return a;
    }
    public static int number(int e,int f,int dp[][],int number1[][],String str[]){
        if(number1[e][f]!=-1){
            return number1[e][f];
        }
        int sum=0;
        for(int i=e;i<f;i++)
        {
            sum=sum*10+Integer.valueOf(str[i])-'0';
        }
        number1[e][f]=sum;
        return sum;
    }
}

