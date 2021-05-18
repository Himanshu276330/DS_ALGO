package Recuesion_Problem.ADV_L_10_In_String;

public class Power_Set_Of_A_String {
    public static void main(String[] args) {

         //Print all possible String made by this string
        powerSet("Abc",0,"");

    }
    static void powerSet(String s,int i ,String current){
        if (i== s.toCharArray().length){
            System.out.println(current);
            return;
        }
        powerSet(s,i+1,current+s.toCharArray()[i]);
        powerSet(s,i+1,current);
    }
}
