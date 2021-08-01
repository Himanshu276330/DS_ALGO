package DATA_STRUCTURE.HEAP_DATA_STRUCTURE;

public class MinHeap_Implementation_And_It_Function {
    public static int []arr;
    public static int capacity;
    public static int size;
    MinHeap_Implementation_And_It_Function(int c){
        arr=new int[c];
        capacity=c;
        size=0;
    }
    public int left(int i){
        return 2*i+1;
    }
    public int right(int i){
        return 2*i+2;
    }
    public int parent(int i){
        return (i-1)/2;
    }

    //Binary heap insertion function...
    public  void Value_Insertion_In_MinHeap (int val){
        if(size==capacity) return;
        arr[size]=val;
        size++;
        for(int i=size-1;i!=0 && arr[i]<arr[parent(i)];){
            swap(i,parent(i));
            i=parent(i);
        }
    }
    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //Min Heapify Function --> Given a binary Heap with one possible violation , fix the Heap
    public void minHeapify(int i){    //At index i it violate
        int left=left(i);
        int right=right(i);
        int smallest=i;
        if(left<size && arr[left]<arr[i] && arr[left]<arr[right]){
            smallest=left;
        }
        if(right<size && arr[right]<arr[i] && arr[right]<arr[left]){
            smallest=right;
        }
        if(smallest!=i) {
            swap(i,smallest);
            minHeapify(smallest);
        }
    }

    //Extract min function
    public int extractMin(){
        if(size==0) return Integer.MAX_VALUE;
        if(size==1) {
            size--;
            return arr[size];
        }
        swap(0,size-1);
        size--;
        minHeapify(0);
        return arr[size];
    }

    //Decrease key function
    public void decrease_key(int key ,int val){
        arr[key]=val;
        while (key!=0 && arr[parent(key)]>arr[key]){
            swap(key,parent(key));
            key=parent(key);
        }
    }

    //Delete key function
    public void delete_key(int key){
        decrease_key(key,Integer.MIN_VALUE);
        extractMin(); // by extracting minimum root is delete
    }

    //Build Heap Function...
    public int [] build_heap(int []arr){
        int l=arr.length;
        int p=(l-1)/2;
        int left,right,temp;
        for(int j=p;j>=0;j--){
            int i=j;
            while (i<l) {
                left = left(i);
                right = right(i);
                if (left < l  && arr[left] < arr[i] ) {
                    if(right<l && arr[left]>arr[right]){
                        temp = arr[i];
                        arr[i] = arr[right];
                        arr[right] = temp;
                        i=right;
                    }else {
                        temp = arr[i];
                        arr[i] = arr[left];
                        arr[left] = temp;
                        i = left;
                    }
                } else if (right < l && arr[right] < arr[i] ) {
                    temp = arr[i];
                    arr[i] = arr[right];
                    arr[right] = temp;
                    i=right;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
