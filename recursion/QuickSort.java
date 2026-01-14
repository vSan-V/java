import java.util.*;
class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        int low = 0;
        int high = arr.length-1;
        function(arr, low, high);
        System.out.println(Arrays.toString(arr));

    }
    public static void function(int[] arr, int low, int high){
        if(low<high){
            int partition = fun(arr, low, high);
            function(arr, low,partition-1);
            function(arr, partition+1, high);
        }
    }

    public static int fun(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[low];
        arr[low]  = arr[j];
        arr[j]  = temp;

        return j;
    }
}