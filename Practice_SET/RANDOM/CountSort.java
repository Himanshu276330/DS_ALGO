package Practice_SET.RANDOM;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {

        int []arr={1,8,9,6,5,7,8,7};
        for (int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        countSort(arr,arr.length);

        for (int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();

    }
    static void countSort(int [] arr,int n){
        int max=Integer.MIN_VALUE;
        for (int e:arr){
            max=Math.max(max,e);
        }
        int [] temp=new int[max+1];
        Arrays.fill(temp,0);
        for (int i=0;i<n;i++){
            temp[arr[i]]=temp[arr[i]]+1;
        }

        int y=0;
        for(int i=0;i< temp.length;i++){
            while(temp[i]>0){
                arr[y]=i;
                temp[i]--;y++;
            }
        }
    }

}
