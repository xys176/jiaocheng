package Test;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] strs = line.split(" ");
        //操作符栈
        Stack<String> ops = new Stack<>();
        //操作数栈
        Stack<Double> vals = new Stack<>();
        for (String s : strs ) {
            //读取字符，如果是运算符则压入栈
//            String s = StdIn.readString();
            //忽略左括号
            if(s.equals("("));
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("-")) ops.push(s);
            else if(s.equals("*")) ops.push(s);
            else if(s.equals("/")) ops.push(s);
            else if(s.equals("sqrt")) ops.push(s);
                //若字符为")"，则弹出运算符和操作数，计算结果压入操作数栈
            else if(s.equals(")")){
                //弹出一个操作符
                String op = ops.pop();
                //弹出一个操作数
                Double v = vals.pop();
                //根据操作符，实施对应的计算
                if(op.equals("+")) v = vals.pop() + v;
                else if(op.equals("-")) v = vals.pop() - v;
                else if(op.equals("*")) v = vals.pop() * v;
                else if(op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                //将计算结果压入操作数栈
                vals.push(v);
            }
            //将表达式中的操作数压入操作数栈
            else vals.push(Double.parseDouble(s.trim()));
        }
        System.out.println(vals.pop());
    }
}

