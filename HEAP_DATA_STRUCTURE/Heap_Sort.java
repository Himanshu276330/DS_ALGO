package HEAP_DATA_STRUCTURE;

public class Heap_Sort {
    public static void main(String[] args) {

        arr=new int[5];
        arr[0]=50;
        arr[1]=20;
        arr[2]=10;
        arr[3]=4;
        arr[4]=15;
        heapSort(arr,arr.length);
        for(int e:arr){
            System.out.print(e+" ");
        }

    }//Main Ends.............................................................................
    static int []arr;
    static void heapSort(int []arr,int n){
        build_Heap(arr,n);
        for(int i=n-1;i>=0;i--){
            swap(arr,0,i);
            maxHeapify(arr,i,0);
        }
    }

    static void build_Heap(int []arr,int n){
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapify(arr,n,i);
        }
    }

    static void maxHeapify(int []arr,int n,int i){
        int largest=i,left=2*i+1,right=2*i+2;
        if (left<n && arr[left]>arr[largest])
            largest=left;
        if (right<n && arr[right]>arr[largest])
            largest=right;
        if(largest!=i){
            swap(arr,i,largest);
            maxHeapify(arr,n,largest);
        }
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
