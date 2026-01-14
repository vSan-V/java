import java.util.*;
class reverseArrayWithI {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int i=0;
      swap(arr,i);
      System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int i){
        int n=arr.length;
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1]=temp;

        swap(arr,i+1);

    }
}