package HARRY_2021;
import java.util.Random;
import java.util.Scanner;

class Game03{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game03(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}

public class CWH_50_EXERCISE_3_SOLUTION {
    public static void main(String[] args) {
        /*Question
        create a class Game ,which allows a user to play "Guess the no " game once
        Game should have the following method:
        1. Constructor to generate the random number
        2. take user input
        3. isCorrectNumber() to detect whether  the number is
        4. getter and setter for moOfGuess
         */

        Game03 g = new Game03();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        };
    }
}
