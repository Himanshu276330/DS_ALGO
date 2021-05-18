package HARRY_2021;

public class CWH_14_STRING_METHOD {
    public static void main(String[] args) {
        String str = new String("     Himanshu   Shekhar");  //-->spaces are also count

        int a1 = str.length();
        System.out.println(a1);
        System.out.println(str.length());

        String str2 = str.toLowerCase();
        System.out.println(str2);
        System.out.println(str.toLowerCase());

        String str3 = str.toUpperCase();
        System.out.println(str3);
        System.out.println(str.toUpperCase());

        String str4 = str.trim();     //Aage ke sare space hata deta h
        System.out.println(str4);
        System.out.print(str4);
        System.out.println(str.trim());

        String str5 = str.substring(8);    // 8 index ke aage ka sara
        System.out.println(str5);           // space is also in index
        System.out.println(str.substring(8));

        String str6 = str.substring(8,17);
        System.out.println(str6);
        System.out.println(str.substring(8,17));

        String str7 = str.replace('u','i');
        System.out.println(str7);
        System.out.println(str.replace('u','i'));

        boolean bol = str.startsWith("     Himanshu");
        System.out.println(bol);
//        System.out.println(str.startsWith("    Himan"));    //false because space has index
//        System.out.println(str.startsWith("     Himan"));   // true

//        System.out.println(str.endsWith("ar"));

//        char c1 = str.charAt(18);
//        System.out.println(c1);
//        System.out.println(str.charAt(18));

//        int a2 = str.indexOf('e');
//        System.out.println(str.indexOf('e'));
//        System.out.println(str.indexOf('a'));

        int a3 = str.indexOf('a',10);
        System.out.println(a3);
//        System.out.println(str.indexOf('a',10));

//        int a4 = str.lastIndexOf('a');
//        System.out.println(a4);
//        System.out.println(str.lastIndexOf('a'));

//        int a5 = str.lastIndexOf('a',20);
//        System.out.println(a5);
//        System.out.println(str.lastIndexOf('a',20));

        boolean b1 = str.equals("     himanshu   shekhar");
        boolean b2 = str.equalsIgnoreCase("     himanshu   shekhar");
        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(str.equals("     Himanshu   Shekhar"));


        System.out.println("My name is : \nHimanshu shekhar");
        System.out.println("My name is : \f Himanshu shekhar");
        System.out.println("My name is : \rHimanshu shekhar");
    }
}
