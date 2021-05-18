package HARRY_2021;

public class CWH_24_BREAK_AND_CONTINUE {
    public static void main(String[] args) {

/*        for (int i=0 ; i<5 ; i++){
            System.out.println(i);
            System.out.println("tou are great");
            if (i==3){
                System.out.println("Break the loop");
                break;
            }
        }

        for (int i=0 ; i<5 ; i++){
            if (i==3){
                System.out.println("Break the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("tou are great");
        }  */

/*        int i2=0;
        do {
            if (i2==3){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i2);
            System.out.println("java is grate"); //-->in this we get error of infinite loop
            i2+=1;
        }while(i2<=10);  */

        int i3=0;
        do {
            i3+=1;
            if (i3==3){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i3);
            System.out.println("java is grate");
            i3+=1;
        }while(i3<=10);




    }
}
