package Test;

import java.util.Scanner;
import java.util.Stack;

public class demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> zf = new Stack<String>();// 存储字符串的栈
        Stack<Double> sz = new Stack<Double>();// 存储数字的栈
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("(")) /* 不做操作 */
                ;
            else if (s.equals("+"))
                zf.push(s);
            else if (s.equals("-"))
                zf.push(s);
            else if (s.equals("*"))
                zf.push(s);
            else if (s.equals("/"))
                zf.push(s);
            else if (s.equals("sqrt"))
                zf.push(s);
            else if (s.equals(")")) {
                // 从栈中取出数据，字符串和数字
                // pop移除堆栈顶部的对象，并作为此函数的值返回该对象。
                String zf1 = zf.pop();
                Double sz1 = sz.pop();
                // 将取出的数据计算
                if (zf1.equals("+"))
                    sz1 = sz.pop() + sz1;// 取出字符串，再进行比较。并取出数字进行相应的计算
                else if (zf1.equals("-"))
                    sz1 = sz.pop() - sz1;
                else if (zf1.equals("*"))
                    sz1 = sz.pop() * sz1;
                else if (zf1.equals("/"))
                    sz1 = sz.pop() / sz1;
                else if (zf1.equals("sqrt"))
                    sz1 = Math.sqrt(sz1);
                // 再将数字放回去
                sz.push(sz1);

            }
            // else if(s.equals(" ")) System.out.println(sz.pop());
            else {
                //如果取出的字符既不是运算符，也不是括号。将这个字符作为数字压入栈中
                sz.push(Double.parseDouble(s));
            }

        }
        // 按ctrl+z退出控制台输入
        //此处输入还可以改进
        System.out.println(sz.pop());
    }

}
