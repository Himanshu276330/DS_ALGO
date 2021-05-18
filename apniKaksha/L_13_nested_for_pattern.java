package apniKaksha;
import java.util.Scanner;

public class L_13_nested_for_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //Pattern 01
        System.out.print("Enter no of line of pattern to print : ");
        int n = sc.nextInt();
        for (int j=1; j<=n; j++){
            for (int i=1; i<=n; i++){
                System.out.print("*  ");
            }
            System.out.println("\n");
        }

        //Pattern 02
        System.out.print("Enter no of line of pattern to print : ");
        int n2 = sc.nextInt();
        for (int j =1;j<=n2; j++){
            for (int i =1; i<=j; i++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        //Pattern 03
        System.out.print("Enter no of line of pattern to print : ");
        int n3 = sc.nextInt();
        for (int j = 1; j<=n3; j++){
            for (int i =1; i<=j-1; i++){
                System.out.print("  ");
            }
            for (int i=1; i<=(n3+1)-j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pattern 04
        System.out.print("Enter no of line of pattern to print : ");
        int n4 = sc.nextInt();
        for (int j=1; j<=n4; j++){
            for (int i=1; i<=n4+1-j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pattern 05
        System.out.print("Enter no of line of pattern to print : ");
         int n5= sc.nextInt();
         for (int j=1; j<=n5; j++){
             for (int i=1; i<=n5-j; i++){
                 System.out.print("  ");
             }
             for (int i=1; i<=j; i++){
                 System.out.print("* ");
             }
             System.out.println();

         }
    }
}
