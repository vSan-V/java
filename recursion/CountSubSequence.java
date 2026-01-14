//count the subsequence of the given array
import java.util.*;
class CountSubSequence {
    public static void main(String[] args) {
       int[] arr={1,2,1};
       int n = arr.length-1;
       int sum=2;
       int index=0;
       int checksum=0;
     //  List<Integer> list = new ArrayList<Integer>(); 
       int res = fun(arr,sum,index,checksum,n);
       System.out.println(res);
    }

    public static int fun(int[] arr, int sum, int index, int checksum, int n){
        if(index > n){
            if(checksum == sum){
                return 1;
            }
            return 0;
        }
        checksum = checksum+arr[index];


        int left = fun(arr,sum,index+1,checksum,n);
        checksum = checksum-arr[index];

        int right = fun(arr,sum,index+1,checksum,n);
        return left+right;
    }
}