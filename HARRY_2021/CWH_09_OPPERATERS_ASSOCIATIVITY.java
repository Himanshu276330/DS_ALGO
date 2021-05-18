package HARRY_2021;

public class CWH_09_OPPERATERS_ASSOCIATIVITY {
    public static void main(String[] args) {
        // Precedence & Associative
        int a1 = 6*4-63/9;
        /*
        Highest precedence goes to * and / . they are then evaluate on the basis of left to right associativity
        24-63/9
        24-7
        17
         .*/
        int a2 = 60/5-34*2;
        /*
        12-34*2
         */
/*        float a =8;
        float b= 8;
        float c= 1;
        float k = b*b-(4*a*c)/(2*a);
        float k2 = (b*b-4*a*c)/(2*a);
        System.out.println(k2);
        System.out.println(k);   */
        int e=3;
        int r=++e;
        System.out.println(r);
    }
}
