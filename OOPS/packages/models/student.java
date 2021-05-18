package OOPS.packages.models;

public class student {
    private String name;
    public student(String name){
        this.name=name;
    }
    String getPassword(){     //Default access h
        return "himanshu@154";
    }
    public String getName(){
        getPassword();
       return name;
    }

}
