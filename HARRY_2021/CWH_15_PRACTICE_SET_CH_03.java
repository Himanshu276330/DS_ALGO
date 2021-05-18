package HARRY_2021;

public class CWH_15_PRACTICE_SET_CH_03 {
    public static void main(String[] args) {
        //Question 01
        String str = new String("HIMANSHU SHEKHAR");
        String str2 = str.toLowerCase();
        System.out.println(str2);
        System.out.println(str.toLowerCase());

        //Question 02
        String str3 = str.replace(" ","_");
        System.out.println(str3);
        System.out.println(str.replace(" ","_"));
        //Method 02
        str = str.replace(" ","_");  //BY THIS WE UPDATE Str ,AND WE GET NEW updated Str.
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);

        //Question 03
        String letter = new String("Dear <|name|>, Thanks a lot");
        String letter2= letter.replace("<|name|>","Vishal Shekhar");
        System.out.println(letter2);

        //Question 04
        String str4 = new String("Insert  a tab  in  the   text at  this  point.");
        System.out.println(str4.indexOf(" ",8));
        System.out.println(str4.indexOf("  "));
        str4 = str4.replace("   ","___");
        str4 = str4.replace("  ","__");
        str4 = str4.replace(" ","_");
        System.out.println(str4);

        //Question 05
        String myletter = "Dear Harry,\n\t\t   This java course is nice.\n\t \t\tThanks.";
        System.out.println(myletter);
    }
}
