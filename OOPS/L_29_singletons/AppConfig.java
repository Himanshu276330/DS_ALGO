package OOPS.L_29_singletons;

public class AppConfig {

    private AppConfig(){     //default constructor ko private karne se new obj nahi create kar sakte
    }

//    private  static  AppConfig obj=new AppConfig();
//    public static AppConfig getInstance(){
//        return obj;
//    }


        //Optimisation
    private  static  AppConfig obj=null;
    public static AppConfig getInstance(){
        if(obj==null){ obj=new AppConfig();}
        return obj;
    }
}
