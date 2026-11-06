import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Insertion sort Approach TC - O(N2) SC - O(1)
      int[] arr = {3,2,1,0,5,4,19};
      int n = arr.length;
      for (int i = 0; i<arr.length; i++){
        for (int j = i; j>0; j--){
          if (arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
          }
          else{
            break;
          }
        }
      }
      for (int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}