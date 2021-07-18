package Binary_Search;

public class CountOfAnElement_inA_Sorted_Array {
    public static void main(String[] args) {

        int[] arr1={2,4,10,10,10,18,20}; int a1=10;
        int[] arr2={1,3,3,3,3,3,3,3,3,3,3,3,5,7}; int a2=3;
        int[] arr3={5};

        System.out.println(count(arr1,10));
        System.out.println(count(arr1,19));
        System.out.println(count(arr2,3));
        System.out.println(count(arr2,2));

    }//Main Ends.................................................

    static int count(int[] arr,int a){
        int fo=FirstAndLastOccurrencesOfElement.indexFirstBS(arr,0,arr.length-1,a);
        int lo=FirstAndLastOccurrencesOfElement.indexLastBS(arr,0,arr.length-1,a);

        if(fo==Integer.MAX_VALUE || lo==Integer.MIN_VALUE) return 0;

        return lo-fo+1;
    }
}
