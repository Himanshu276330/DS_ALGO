package ALGORITHMS.Binary_Search;

public class Allocate_minimum_no_OfPages {
    public static void main(String[] args) {

        int[] arr={10,20,30,50,60,45};
        System.out.println(minPages(arr,2));
        System.out.println(minPages(arr,3));
        System.out.println(minPages(arr,4));

    }//Main Ends.........................................................................

    static int minPages(int[] books,int students){
        int start=0,end=0;
        for(int e:books){
            end+=e;
            start=Math.max(e,start);
        }

        int mid,ans=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(isValid(books,students,mid)) {
                ans = mid;
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;
    }

    static boolean isValid(int[] books,int student,int pages){
        int sum=0,count=1;
        for(int e:books){
            if(sum+e>pages){
                count++;
                sum=0;
            }
            if(count>student) return false;
            sum+=e;
        }
        return true;
    }

}
