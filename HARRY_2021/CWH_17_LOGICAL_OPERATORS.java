package HARRY_2021;

public class CWH_17_LOGICAL_OPERATORS {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        //For logical OR
        if(a || b){
            System.out.println("YES");
        }
        else {
            System.out.println("no");
        }
        //For logical NOT
        System.out.println("For logical NOT ");
        System.out.println("Not (a) is "+!a);
        System.out.println(!a);
        System.out.println("Not (b) is "+!b);
        System.out.println(!b);
    }
}
