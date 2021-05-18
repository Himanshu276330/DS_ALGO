package HARRY_2021;
import java.util.Scanner;
import java.util.Random;

class game{
    public void  name(){
        System.out.println("Guess the number game");
    }
    Random random=new Random();
    public int ComputerInput(){
        int ComputerInput= random.nextInt();
        return ComputerInput;
    }

}

public class CWH_43_Exercise_03 {
    public static void main(String[] args) {

        //System.out.println(game);
        game myGame = new game();
        System.out.println(myGame);

    }
}
