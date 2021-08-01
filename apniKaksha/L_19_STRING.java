package apniKaksha;

public class L_19_STRING {
    public static void main(String[] args) {

           //DATA_STRUCTURE.String is nonPrimitive data type
           //DATA_STRUCTURE.String is immutable

//        DATA_STRUCTURE.String name = "Himanshu Shekhar";                    //It is present in DATA_STRUCTURE.String pool area
//        DATA_STRUCTURE.String name2=new DATA_STRUCTURE.String("Himanshu Shekhar");   //It is present in heap area
//        DATA_STRUCTURE.String name3=" ";
//        System.out.println(name);
//        System.out.println(name2);

            //Both are not  same
//        System.out.println(name.equals(name2));   //It compared only words/value
//        System.out.println(name==name2);           //It compared only words and where it present also

        //DATA_STRUCTURE.String Function

//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//
//        System.out.println(name.length());  //Space also included in length
//
//        System.out.println(name.substring(4));
//        System.out.println(name.substring(4,15));        //15 wala index ka char include nahi hota h -- [4,15)
//
//        System.out.println(name.contains("imansh"));
//        System.out.println(name.contains("i"));
//        System.out.println(name.contains("z"));
//
//        System.out.println(name3.isBlank());  //word nahi h
//        System.out.println(name3.isEmpty());  //Space h usme isiliye false deraha h


//        name3=name+name2;
//        System.out.println(name3);
//        System.out.println(name.concat(" sharma"));


//        DATA_STRUCTURE.String cars="car1,car2,car3,car4";
//        DATA_STRUCTURE.String allCars[] = cars.split(",");
//        DATA_STRUCTURE.String allCars2[] = cars.split("a");
//        for (DATA_STRUCTURE.String c:allCars){
//            System.out.println(c);
//        }
//        for (DATA_STRUCTURE.String c:allCars2){
//            System.out.println(c);
//        }

//        System.out.println(name.indexOf("a"));
//        System.out.println(name.lastIndexOf("a"));
//
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//
//        DATA_STRUCTURE.String name5="  himanshu  ";
//        System.out.println(name5.trim());           //Spaces hata deta h

        String s="        Himanshu     shekhar   visha       ";
        String s2=s.trim();
        String [] ss=s2.split("(\\s)+");
//        DATA_STRUCTURE.String [] ss=s.split(" ");
        for(String ee:ss){
            System.out.print(ee+" ");
        }

    }
}
