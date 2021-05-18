package OOPS.L_34_INTERFACE;

public class Person implements Student,Youtuber {
    public static void main(String[] args) {

        Person p=new Person();
        p.study();
        p.makeVideo();

        //Down casting,only Youtuber function is call by obj
        Youtuber obj=p;
        obj.makeVideo();
        obj.editAudio();
        //obj.study;     //gives error

        p.uploadVideo();
    }

    @Override
    public void study() {
        System.out.println("person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making good video");
    }

    @Override
    public void editVideo() {
        System.out.println("editing video");
    }

    @Override
    public void editAudio() {
        System.out.println("person is editing audio");
    }
}
