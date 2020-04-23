package Test;

public class Test6 {
    public static void main(String[] args) {
        String s1="Welcome to java";
        String s2=s1;
        String s3=new String("aaa");
        System.out.println("s1==s2 is "+(s1==s2));
        System.out.println("s1==s3 is "+(s1==s3));
        System.out.println(s1.equals(s2));
        System.out.println("Welcome to java".replace("java","HTMP"));
        System.out.println(s1.replaceAll("o","T"));
        System.out.println(s1.toCharArray());
    }
}
