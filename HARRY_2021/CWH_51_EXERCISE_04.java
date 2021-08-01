package HARRY_2021;

class Library01{
    public void allBook(String...arr){
    }
    public void issuedBook(String ...arr){
    }
    //public DATA_STRUCTURE.String  showAvailableBook(DATA_STRUCTURE.String ...arr){
        //return showAvailableBook();
    //}
    public void addBook(String ...arr){
    }
    public void returnBook(String ...arr){
    }
}

public class CWH_51_EXERCISE_04 {
    public static void main(String[] args) {
        /*Question 04
         you have to implement a library using java class Library
         Methods:addBook,issueBook,returnBook,showAvailableBook
         Property:array to store the available book,array to store the issued book
         */

        Library01 l=new Library01();
        l.issuedBook("bi","b2","b3");
        //l.showAvailableBook("b4","b5","b6","b7","b8","b9","b10");
        l.addBook("b11","b12");
    }
}
