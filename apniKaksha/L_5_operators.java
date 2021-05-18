package apniKaksha;

public class L_5_operators {
    public static void main(String[] args) {
        //arithmetic operators
        int a = 23;
        int b= 45;
        int c = ++b;
        System.out.println(c+" "+b);


        int b2 =45;
        int c2 = b2++;
        System.out.println(c2+" "+b);

        //bit wise operators
        int a3 = 3;     //in bit 3-->011
        int b3 = 5;     //in bit 5-->101
                      //--------------------------
               //or bit wise         111
             // and bit wise         001

        int c3 = 3 & 5;        //bit wise And operators
        int d = 3 | 5;          //bit wise Or operators
        System.out.println(c);   //in bit 1-->001
        System.out.println(d);   //in bit 7-->111

        //Shift operators
        int i = 6;
        int j = 13;

        //That shifting is happen in bits

        // 1101[13] -> 0110[6] -> 0011[3] -> 0001 -> 0000 -> 0000 ...==forward shift
        //Observation no har step me 2 se divide kar ke integral part lena h
        int k = j >> 2;   //forward ward shift ,i.e- means j ko bit wise 2 step forward shift karo
        System.out.println(k);

        //backward shift
        //har backward shift me value double ho gaye ga
        //j[13] << 26 << 52 << ...
        int l = i << 1;
        System.out.println(l);


    }
}
