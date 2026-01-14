import java.util.*;
class SumOfAllSubArrayK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<Integer> list = new ArrayList<>();
        int k=2;
        int i=0;
        int j=0;
        int sum=0;

        while(j<arr.length){
            sum = sum+arr[j];
            if(j-i+1==k){
                list.add(sum);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println(list);    
    }
}