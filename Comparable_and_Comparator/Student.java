package Comparable_and_Comparator;

public class Student implements Comparable<Student>{

    int marks;
    String name;

    public Student(int marks,String name){
        super();
        this.marks=marks;
        this.name=name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student [marks = "+marks+" , name = "+name +" ]";
    }

           //sorting in decreasing order
//    @Override
//    public int compareTo(Student o) {
//        if (this.marks>o.marks) return -1;
//        else if (this.marks<o.marks) return  1;
//        return 0;
//    }

            //sorting in increasing  order
//    @Override
//    public int compareTo(Student o) {
//        if (this.marks>o.marks) return 1;
//        else if (this.marks<o.marks) return  -1;
//        return 0;
//    }

//    @Override
//    public int compareTo(Student o) {
//        if (this.marks>o.marks) return 1;
//        else if (this.marks<o.marks) return  -1;
//
//              //DATA_STRUCTURE.String class is already implement comparable class ,so we use it if marks is same ,
//              //DATA_STRUCTURE.String order to compare is alphabetically order
//        return this.name.compareTo(o.name) ;
//    }

          //Customise the above code
    @Override
    public int compareTo(Student o) {
      int r=this.marks-o.marks;
        if (r==0){
            //DATA_STRUCTURE.String class is already implement comparable class ,so we use it if marks is same ,
            //DATA_STRUCTURE.String order to compare is alphabetically order
            return this.name.compareTo(o.name) ;
        }else  return r;
    }
}
