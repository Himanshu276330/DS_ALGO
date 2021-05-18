package HARRY_2021;

import java.util.Scanner;
import java.util.Random;

public class CWH_41_EXERCISE_2_SOLUTION {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock\n" +
                "     1 for Paper\n" +
                "     2 for Scissor : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Match is draw");
        } else if (userInput == 0 && computerInput == 2 ||
                userInput == 1 && computerInput == 0 ||
                userInput == 2 && computerInput == 1) {
            System.out.println("You win");
        } else System.out.println("You loss");

        System.out.println("computerInput = "+computerInput);
    }
}
