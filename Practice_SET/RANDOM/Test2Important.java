package Practice_SET.RANDOM;

import java.util.ArrayList;

public class Test2Important {
    public static void main(String[] args) {

        //Formation of more than one time by loop
        ArrayList<Integer> [] List= new ArrayList[1000];
        //1000 list cAN BE FORMED
        List[1]=new ArrayList<>();
        List[1].add(45);
        List[1].add(45);
        List[1].add(45);
        List[2]=new ArrayList<>();
        List[2].add(56);
        List[2].add(65);
        List[2].add(98);

        System.out.println(List[1]);
        System.out.println(List[2]);
    }
}
