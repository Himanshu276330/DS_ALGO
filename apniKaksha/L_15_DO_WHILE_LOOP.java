package apniKaksha;
import java.util.Scanner;

public class L_15_DO_WHILE_LOOP {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int no;    //---->  important
        do {
             no = sc.nextInt();
            System.out.println("number is "+no);
        }while (no!=0);
    }
}
