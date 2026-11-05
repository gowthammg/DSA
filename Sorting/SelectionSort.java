import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Selection  sort TC - O(N2) SC - O(1)
      int[] arr = {3,2,1,0,5,4,19};
      int i = 0;
      int n = arr.length;
      while (i < n){
        int minindex = i;
        for (int j = i+1; j<arr.length; j++){
          if (arr[j] < arr[i]){
            minindex = j;
          }
        }
        int temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
        i++;
      }
      for (i = 0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}