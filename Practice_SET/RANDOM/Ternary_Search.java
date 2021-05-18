package Practice_SET.RANDOM;

public class Ternary_Search {
    public static void main(String[] args) {

//        Solution s=new Solution();
        int [] arr = {1,2,3,4,9};

        int ans= Solution.ternarySearch(arr,arr.length,1);
        int ans2=ternarySearch(0, arr.length-1, 9,arr);
        System.out.println(ans);
        System.out.println(ans2);

    }

    // Function to perform Ternary Search
    static int ternarySearch(int l, int r, int key, int ar[])
    {
        if (r >= l) {

            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if key is present at any mid
            if (ar[mid1] == key) {
                return 1;
            }
            if (ar[mid2] == key) {
                return 1;
            }

            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (key < ar[mid1]) {

                // The key lies in between l and mid1
                return ternarySearch(l, mid1 - 1, key, ar);
            }
            else if (key > ar[mid2]) {

                // The key lies in between mid2 and r
                return ternarySearch(mid2 + 1, r, key, ar);
            }
            else {

                // The key lies in between mid1 and mid2
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }

        // Key not found
        return -1;
    }

}

class Solution{

static int ternarySearch(int arr[], int N, int K){
    return ternarySearch2(arr,0,N-1,K);
}

 private static int ternarySearch2(int arr[],int start,int end, int K){

            if(end>=start) {
                int mid1 = start + (end - start) / 3;
                int mid2 = end - (end - start) / 3;

                if (arr[mid1] == K) {
                    System.out.println("return");
                    return 1;

                }
                if (arr[mid2] == K) {
                    System.out.println("return");
                    return 1;
                }

                if (K < arr[mid1]) {
                    return ternarySearch2(arr, start, mid1 - 1, K);
                } else if (K > arr[mid2]) {
                    return ternarySearch2(arr, mid2 + 1, end, K);
                } else {
                    return ternarySearch2(arr, mid1 + 1, mid2 - 1, K);
                }
            }
              return -1;
        }
}

