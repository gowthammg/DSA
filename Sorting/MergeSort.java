import java.util.*;

public class Main {
    public static void sort(int[] arr, int start, int end){
      if (end == start)
        return ;
      else{
        int n = start+(end-start)/2;
        sort(arr, start, n);
        sort(arr, n+1, end);  
        int p1 = start;
        int p2 = n+1;
        int e1 = n;
        int e2 = end;
        int s  = start;
        //System.out.println(p1+" "+n+" "+p2+" "+end);
        int[] copy = new int[end-start+1];
        int size = 0;
        while (p1 <=n && p2 <=end){
          if (arr[p1] < arr[p2]){
            copy[size++] = arr[p1++];
          }
          else{
            copy[size++] = arr[p2++];
          }
        }
        while (p1 <= n){
          copy[size++] = arr[p1++];
        }
        while (p2 <= end){
          copy[size++] = arr[p2++];
        }
        size = 0;
        while (size < copy.length){
          arr[start+size] = copy[size++];
        }
      }
    } 
    public static void main(String[] args) {
      int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
      sort(arr, 0, arr.length-1);
      for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
    }
}