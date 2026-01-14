import java.util.*;
class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k=7;
        int i=0;
        int j=0;
        int max=0;
        int sum = 0;

        while(j<arr.length){
            sum = sum+arr[j];
            
            while(sum>k){
                sum = sum-arr[i];
                i++;
            }
            max = Math.max(max,j-i+1);

            j++;
        }
    System.out.println(max);
    }
}