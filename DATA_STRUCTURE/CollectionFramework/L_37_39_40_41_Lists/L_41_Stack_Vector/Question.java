package DATA_STRUCTURE.CollectionFramework.L_37_39_40_41_Lists.L_41_Stack_Vector;

import java.util.Scanner;
import java.util.Stack;

public class Question {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of Ternary_Search cases : ");
        int testCases=sc.nextInt();
            //to go in next line input
        sc.nextLine();
        while(testCases-- !=0){
            System.out.println("Enter the string : ");
            String s=sc.nextLine();
            Stack<Character> stack=new Stack<>();

            boolean isBalanced =true;

            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if (ch=='(' || ch=='{' || ch=='[' ){
                    stack.push(ch);
                }
                else if (stack.isEmpty()){
                    isBalanced=false;
                    break;
                }
                else if(ch==')'){
                    if (stack.peek()=='('){
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }else if(ch=='}'){
                    if (stack.peek()=='{'){
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }else if(ch==']'){
                    if (stack.peek()=='['){
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()){
                isBalanced=false;
            }
            if (isBalanced){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }
        }


    }
}
