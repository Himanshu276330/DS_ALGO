package HARRY_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Himanshu Shekhar
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html">java doc</a>
 */
public class CWH_111_FILE_HANDLING_IN_JAVA {
    public static void main(String[] args)  {

        //Code to create file
      File myFile=new File("file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Problem in creating file");
            e.printStackTrace();
        }

        //Code to write in file
        try {
            FileWriter myFileWriter = new FileWriter("file.txt");
            myFileWriter.write("This is our first file from this java course\n okay bye" );
            myFileWriter.close();
        }catch (IOException e){
            System.out.println("Problem in writing in file");
        }

        //Code to read file
        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Code to delete file
        if(myFile.delete()){
            System.out.println("I have deleted : "+myFile.getName());
        }else System.out.println("Problem in deleting file");

    }
}
