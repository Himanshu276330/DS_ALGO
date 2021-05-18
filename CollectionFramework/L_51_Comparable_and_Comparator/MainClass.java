package CollectionFramework.L_51_Comparable_and_Comparator;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        students.add(new Student(596,"Ram"));
        students.add(new Student(105,"Anuj"));
        students.add(new Student(59,"Kumar"));
        students.add(new Student(98,"Shyam"));
        students.add(new Student(98,"Harsh"));
        students.add(new Student(1098,"Harsh"));

           //It is a lambda function to customise code
        students.forEach(System.out::println);


//               //Sorting method 1
//        System.out.println("After apply comparable ");
//        Collections.sort(students);
//             //IT is a lambda function to customise code
//        students.forEach(System.out::println);


//               //Sorting method 02
        System.out.println("After apply comparator \n ");
        Collections.sort(students,new SortByNameThenMarks());
        students.forEach(System.out::println);


//              //Sorting method 03
//        System.out.println("After apply anonymous class comparator , withOut making a class \n ");
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.name.equals(o2.name)){
//                    return o1.marks-o2.marks;
//                }else {
//                    return o1.name.compareTo(o2.name);
//                }
//            }
//        });
//        students.forEach(System.out::println);


//          //Sorting method 04 by using lambda function
//        System.out.println("After apply anonymous class comparator , withOut making a class \n ");
//        Collections.sort(students,(o1, o2) -> {
//            if (o1.name.equals(o2.name)) {
//                return o1.marks - o2.marks;
//            } else {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        students.forEach(System.out::println);


//        //Sorting method 05 by using lambda function
//        System.out.println("After apply anonymous class comparator , withOut making a class \n ");
//        students.sort((o1, o2) -> {
//            if (o1.name.equals(o2.name)) {
//                return o1.marks - o2.marks;
//            } else {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        students.forEach(System.out::println);


//           //Sorting method 06 by using lambda function
//        System.out.println("After apply anonymous class comparator \n ");
//        students.sort((o1, o2) -> o1.name.compareTo(o2.name));
//
//        students.forEach(System.out::println);


//        //Sorting method 07 by using lambda function
//        System.out.println("After apply anonymous class comparator \n ");
//        students.sort(Comparator.comparing(o -> o.name));
//
//        students.forEach(System.out::println);


//        //Sorting method 08 by using lambda function
//        System.out.println("After apply anonymous class comparator \n ");
//        students.sort(Comparator.comparing(Student::getName));
//
//        students.forEach(System.out::println);


        //Sorting method 09 by using lambda function
        System.out.println("After apply anonymous class comparator \n ");
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

        students.forEach(System.out::println);


        //Sorting method 10 by using lambda function
        System.out.println("After apply anonymous class comparator \n ");
              //get name is sorted in decreasing alphabetically  order default
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

        students.forEach(System.out::println);


        //Sorting method 11 by using lambda function
        System.out.println("After apply anonymous class comparator \n ");
        students.sort(Comparator.comparing(Student::getName).reversed().thenComparing(Student::getMarks).reversed());

        students.forEach(System.out::println);




    }

     static class SortByNameThenMarks implements Comparator<Student>{
          //It work on that if ,,we return +ve no then o1 is return and if return -ve no o2 is return..
        @Override
        public int compare(Student o1,Student o2){
            if (o1.name.equals(o2.name)){
                return o1.marks-o2.marks;
            }else {
                return o1.name.compareTo(o2.name);
            }
        }
    }


}
