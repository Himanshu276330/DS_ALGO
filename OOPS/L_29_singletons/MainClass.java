package OOPS.L_29_singletons;

public class MainClass {

    public static void main(String[] args) {

        //All obj1=obj2=obj3 are same
        AppConfig obj1=AppConfig.getInstance();
        AppConfig obj2=AppConfig.getInstance();
        AppConfig obj3=AppConfig.getInstance();
        AppConfig obj4=AppConfig.getInstance();
    }
}
