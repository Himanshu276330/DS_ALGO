package DATA_STRUCTURE.Arrays;

public class L_18_Selection_Sort {
    public static void main(String[] args) {

        int []a={5,2,-1,6,3};
        int n=a.length;

        for (int i=0;i<n;i++){
            int minIndex=i;
            for (int j=i+1;j<n;j++){
                if(a[j]<a[minIndex]){
                    int temp=a[minIndex];
                    a[minIndex]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
