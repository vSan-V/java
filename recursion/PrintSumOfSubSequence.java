import java.util.*;
class PrintSumOfSubSequence {
    public static void main(String[] args) {
       int[] arr={1,2,1};
       int n = arr.length-1;
       int sum=2;
       int index=0;
       int checksum=0;
       List<Integer> list = new ArrayList<Integer>(); 
       fun(arr,list,sum,index,checksum,n);
    }

    public static void fun(int[] arr, List<Integer> list, int sum, int index, int checksum,int n){

        if(index > n){
            if(checksum == sum){
                System.out.println(list);
            }
            return;
        }

        checksum = checksum+arr[index];
        list.add(arr[index]);
        fun(arr, list, sum, index+1, checksum,n);

        checksum = checksum-arr[index];
        list.remove(list.size()-1);
        fun(arr, list, sum, index+1, checksum,n);


    }
}