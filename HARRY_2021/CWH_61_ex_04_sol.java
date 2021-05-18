package HARRY_2021;

class Library{
    String[] books;
    int no_of_book;
    Library(){
        this.books=new String[100];
        this.no_of_book=0;
    }
    void addBook(String book){
        this.books[no_of_book]=book;
        System.out.println("The added book is : "+book);
        no_of_book++;
    }
    void availableBook(){
        System.out.println("The available book are: ");
        for (int i=0;i<this.books.length;i++){
            if (this.books[i]==null)break;
            System.out.println(this.books[i]);
        }
    }
     void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i]==book){
                System.out.println("The book has been issued!");
                this.books[i] = null;
            }else {
                System.out.println("This book does not exist");
                break;
            }
        }
        System.out.println("This book does not exist");
    }

}

public class CWH_61_ex_04_sol {
    public static void main(String[] args) {

        Library centralLibrary=new Library();
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("Java book");
        centralLibrary.addBook("C++ book");
        centralLibrary.availableBook();
        centralLibrary.issueBook("C++ book");
        centralLibrary.availableBook();
        centralLibrary.issueBook("Rich and Poor");

    }
}
