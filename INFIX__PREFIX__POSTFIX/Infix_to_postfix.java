package INFIX__PREFIX__POSTFIX;

import java.util.Stack;

public class Infix_to_postfix {
    public static void main(String[] args) {

        // Prefix , Postfix and infix are all a type of notation to represent expression.

        // + - * / only that present..
        stack=new Stack<>();
        System.out.println(convert("b*b-4*a*c"));  // postfix -->[ bb*4a*c*- ]

    }//Main ends........................................................................................................

    static Stack<Character> stack;
    static String convert(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(s.charAt(i))){
                    sb.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }else
                sb.append(s.charAt(i));
        }

        // To collect remaining operators.
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    static int precedence(Character ch){
        if(ch=='*' || ch=='/') return 2;
        else return 1;
    }
}
