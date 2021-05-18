package BIT_Magic_or_Manipulation;

import java.util.*;

public class ADV_L_4_advance_Bit_Manipulation {
    public static void main(String[] args) {

           //Question 01
        System.out.println("//Question 001");
        int []arr={5,4,1,4,5,1,2};
        System.out.println(find_One_Non_Repeating_Element(arr));

        //Question 002
        System.out.println("//Question 002");
        int []arr2={5,4,1,4,5,1,2,3};
        find_Two_Non_Repeating_Element(arr2);


        //Question 003
        //Find the only non-repeating element in an array where every other element repeat thrice
        System.out.println("//Question 003");
        int []arr3={2,2,1,5,1,1,2};
        find_one_Non_repeating_no_whileAllRepeatThrice(arr3);



//
//
//          //Question 03
//        int []a={2,2,1,5,1,1,2};
//        int k=3;  //No of time it repeat.
//        byte sizeof_int = 4;
//        int INT_SIZE = 8 * sizeof_int;
//        int count[] = new int[INT_SIZE];
//
//        // AND(bitwise) each element of the array
//        // with each set digit (one at a time)
//        // to get the count of set bits at each
//        // position
//        for (int i = 0; i < INT_SIZE; i++){
//            for (int j = 0; j < a.length; j++){
//                if ((a[j] & (1 << i)) != 0){
//                    count[i] += 1;
//                }
//            }
//        }
//        // Now consider all bits whose count is
//        // not multiple of k to form the required
//        // number.
//        int res = 0;
//        for (int i = 0; i < INT_SIZE; i++) {
//            res += (count[i] % k) * (1 << i);
//        }
//        System.out.println(res);
//        System.out.println(2%3);
    }

    //Question 01
    static int find_One_Non_Repeating_Element(int []a){
        int ans=0;

        //Use this XOR property.
        // x^0 == x;   x^x == 0;

        for (int e:a){
            ans=ans^e;
        }
        return ans;
    }


    //Question 002
    static void find_Two_Non_Repeating_Element(int []a){
        int num=0;
        for (int e:a){
            num=num^e;
        }

        int num1=0;
        int num2=0;
         //finding least set bit of num
        // Bitwise & the sum with it's 2's Complement , will give us the sum containing, only the rightmost set bit
        int l=num&(-num);

        for (int e:a){
            if((l&e)>0){
                num1=num1^e;
            }
            else {
                num2=num2^e;
            }
        }
        System.out.println("1st no is: "+num1+" and 2nd no is : "+num2);
    }


    static void find_one_Non_repeating_no_whileAllRepeatThrice(int []a){
        Map<Integer,Integer> count=new HashMap<>();

        for (int e:a){
            if (count.containsKey(e)){
                count.put(e, (count.get(e)+1));
            }else{
                count.put(e,1);
            }
        }
           //Finding key associated with a give value. [****** imp]
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            //if (entry.getValue().equals(1)) {
            if (entry.getValue()==1) {
                System.out.println("The no is : " + entry.getKey());
            }
        }
    }


}
