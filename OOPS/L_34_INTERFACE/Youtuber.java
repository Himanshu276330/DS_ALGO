package OOPS.L_34_INTERFACE;

//A interface can extend multiple interface ,
// A class can implement multiple interface ,
// A class can extend only  one class.
public interface Youtuber extends videoEditor,audioEditing{

      //By default all method in interface is public and abstract.
    void makeVideo();

    //  After java 8.1  in interface a body is created ,
    //  also it may create diamond like problem
    default void uploadVideo(){
        System.out.println("Youtuber is Upload the video");
    }
}
