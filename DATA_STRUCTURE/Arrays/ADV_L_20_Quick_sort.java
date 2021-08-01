package DATA_STRUCTURE.Arrays;

public class ADV_L_20_Quick_sort {
    public static void main(String[] args) {

        int []a={8,4,1,5,9,2,8,98,4};
        int n=a.length;
        QuickSort(a,0,a.length-1);
        for (int e:a){
            System.out.print(e+" ");
        }

    }

    static void swap(int []a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    static void QuickSort(int []a, int l, int h){
        if(l<h){
            int pivot=partition(a,l,h);
            QuickSort(a,l,pivot-1);
            QuickSort(a,pivot+1,h);
        }
    }

    static int partition(int []a,int l, int h){
        int pivot=a[l];
        int i=l;
        int j=h;
        while(i<j){
            while(a[i]<=pivot){
                if (i>=h) break;
                i++;
            }
            while(a[j]>=pivot){
                if(j<=l) break;
                j--;
            }
            if (i<j){
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return j;
    }


}
