import java.util.*;

public class Main {

    // quickSort TC - O(n log n) SC - O(log n)
    public static int partition(int[] arr, int start, int end){
      int low = start;
      int high = end-1;
      int pivot = arr[end]; 
      while (low <= high){
        if (arr[low] < pivot){
          low++;
        }
        else if (arr[high] > pivot){
          high--;
        }
        else{
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          low++;
          high--;
        }
      }
      int temp = arr[low];
      arr[low] = pivot;
      arr[end] = temp;
      return low;
    }
    
    public static void quickSort(int[] arr, int start, int end){
      if (start < end){
        int part = partition(arr, start, end);
        quickSort(arr, start, part-1);
        quickSort(arr, part+1, end);
      }
    }

    public static void main(String[] args) {
      int[] arr = new int[]{10,9,2,1,0,3,4,5,6,7,8};
      quickSort(arr, 0, arr.length-1);
      for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}