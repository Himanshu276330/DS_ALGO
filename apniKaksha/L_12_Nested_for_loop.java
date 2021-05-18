package apniKaksha;

public class L_12_Nested_for_loop {
    public static void main(String[] args) {

            //nested for loop
        for (int i= 1;i<=100; i++){
            for (int i2=1; i2<=10;i2++){
                System.out.print(i2+" ");
            }
            System.out.println();
        }

            //Question 01
       for (int i= 1; i<=20; i++){
           for (int i2= 1;i2<=10; i2++){
               System.out.print(i*i2+"  ");
           }
           System.out.println("\n");
       }

        //method 2
        for (int i= 1; i<=20; i++){
            int table=i;
            for (int i2= 1;i2<=10; i2++){
                System.out.print(table*i2+"  ");
            }
            System.out.println("\n");
        }
    }
}
