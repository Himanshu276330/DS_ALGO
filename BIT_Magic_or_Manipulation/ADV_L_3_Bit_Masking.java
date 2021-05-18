package BIT_Magic_or_Manipulation;

public class ADV_L_3_Bit_Masking {
    public static void main(String[] args) {

        //Question 01 --> Find the i bit of a no.
        System.out.println("//Question 001");
        int n=124568;
        System.out.println(find_i_Bit(n,5));
        System.out.println(find_i_Bit(3,1));
        System.out.println(find_i_Bit(4,2));

        //Question 002
        System.out.println("//Question 002");
        int n2=3;
        System.out.println(set_i_Bit(n2,2));

        //Question 003
        System.out.println("//Question 003");
        System.out.println(UnSet_i_Bit(4,2));
        System.out.println(UnSet_i_Bit(4,1));
        System.out.println(UnSet_i_Bit(25,3));
        System.out.println(UnSet_i_Bit(25,4));

        //Question 004
        System.out.println("//Question 004");
        System.out.println(No_Of_Bit_Change_To_Convert_A_to_B(2,3)); //2-> 10, 3->11
        System.out.println(No_Of_Bit_Change_To_Convert_A_to_B(11,3)); //11-> 1011, 3->11
        System.out.println(No_Of_Bit_Change_To_Convert_A_to_B(15,3)); //11-> 1111, 3->11





    }
    //Question 01 --> Find the i bit of a no.
    static int find_i_Bit(int n,int i){
        int mask=1;
        mask=mask<<i;
        if ((n&mask)>0)  return 1;

        return 0;
    }

    //Question 002 --> set the i bit of a no.
    static int set_i_Bit(int n,int i){
        int mask=1;
        mask=mask<<i;
        n = (n | mask);
       return n;
    }

    //Question 003 --> Un-set the i bit of a no if it is set .
    static int UnSet_i_Bit(int n,int i){
        int mask=1;
        mask=~(mask<<i);
        return n&mask;
    }

    //Question 004 -->No of bit change to convert a to b .
    static int No_Of_Bit_Change_To_Convert_A_to_B(int a,int b){
        int num=a^b;
        int count=0;
        while(num!=0){

             //UnSet least significant bits.
            num=(num&(num-1));

            count++;
        }
        return count;
    }
}
