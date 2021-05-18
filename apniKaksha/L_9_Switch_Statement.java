package apniKaksha;

public class L_9_Switch_Statement {
    public static void main(String[] args) {

        int dayOfWeek  = 4;
        switch (dayOfWeek){
            case 1:
                System.out.println("I play game");
                break;
            case 2:
                System.out.println("I am in office");
                break;
            case 3:
                System.out.println("I am playing football");
                break;
            case 4:
                System.out.println("I play football");
                break;
            case 5:
                System.out.println("I am on leave");
                break;
            default:
                System.out.println("I don't know what day it is");
        }

    }
}
