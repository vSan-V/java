import java.util.*;
class reverseArray {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int l=0;
      int r = arr.length-1;
      swap(arr,l,r);
      System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l] =arr[r];
        arr[r]=temp;
        swap(arr,l+1,r-1);

    }
}