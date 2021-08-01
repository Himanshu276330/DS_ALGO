package DATA_STRUCTURE.Arrays;

public class L_18_Shorting_by_BUBBLE_SHORT {
    public static void main(String[] args) {

      int arr[] = {78,52,65,9,10};
      for (int i=0;i<arr.length-1;i++) {
          for (int j = 0; j < arr.length-1; j++) {
              if (arr[j] > arr[j + 1]) {
                  //System.out.print("swap  ");
                  int temp = arr[j + 1];
                  arr[j + 1] = arr[j];
                  arr[j] = temp;
              } else {
                  //System.out.println("no swap");
              }
          }
      }
        for (int obj : arr) {
            System.out.print(obj + " ");
        }


              //Some optimisation
//      int arr[] = {78,52,65,9,10};
//      for (int i=0;i<arr.length-1;i++) {
//          for (int j = 0; j < arr.length-1-i; j++) {       //inner lopp ab kam chalega
//              if (arr[j] > arr[j + 1]) {
//                  //System.out.print("swap  ");
//                  int temp = arr[j + 1];
//                  arr[j + 1] = arr[j];
//                  arr[j] = temp;
//              } else {
//                  //System.out.println("no swap");
//              }
//          }
//      }
//        for (int obj : arr) {
//            System.out.print(obj + " ");
//        }


             //some more optimisation
        int arr3[] = {78,52,65,9,10};
      for (int i=0;i<arr3.length-1;i++) {
          boolean shorted=true;           //if sorted already then break
          for (int j = 0; j < arr3.length-1-i; j++) {
              if (arr3[j] > arr3[j + 1]) {
                  int temp = arr3[j + 1];
                  arr3[j + 1] = arr3[j];
                  arr3[j] = temp;
                  shorted=false;
              }
          }
          if (shorted) break;
          System.out.print("swap  ");
      }
        for (int obj : arr3) {
            System.out.print(obj + " ");
        }

    }
}
