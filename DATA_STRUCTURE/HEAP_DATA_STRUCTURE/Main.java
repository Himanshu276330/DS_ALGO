package DATA_STRUCTURE.HEAP_DATA_STRUCTURE;

public class Main {
    public static void main(String[] args) {

        MinHeap_Implementation_And_It_Function mh=new MinHeap_Implementation_And_It_Function(12);
//        mh.Value_Insertion_In_MinHeap(40);
//        mh.Value_Insertion_In_MinHeap(20);
//        mh.Value_Insertion_In_MinHeap(30);
//        mh.Value_Insertion_In_MinHeap(35);
//        mh.Value_Insertion_In_MinHeap(25);
//        mh.Value_Insertion_In_MinHeap(80);
//        mh.Value_Insertion_In_MinHeap(32);
//        mh.Value_Insertion_In_MinHeap(100);
//        mh.Value_Insertion_In_MinHeap(70);
//        mh.Value_Insertion_In_MinHeap(60);
//        for(int i=0;i<mh.size;i++){
//            System.out.print(mh.arr[i]+" ");
//        }
//        System.out.println();

        //Extract Minimum....
//        int min= mh.extractMin();
//        System.out.println(min);

        //Delete key function...
//        mh.delete_key(1);
//        for(int i=0;i<mh.size;i++){
//            System.out.print(mh.arr[i]+" ");
//        }
//        System.out.println();


        int []arr={10,5,20,2,4,8};
        int []arr1= mh.build_heap(arr);
        for (int j : arr1) {
            System.out.print(j + " ");
        }

    }
}
