//Space complexity O(2^n*n)
//Time complexity O(2^n*n)
//Auxillary space O(n)

import java.util.*;
class SumOfSubSet2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3};
        Arrays.sort(arr);
        List<List<Integer>> ans  =new ArrayList<>();
        solution(0,arr,ans,new ArrayList<Integer>());
        System.out.println(ans);
        
    }
    public static void solution(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i] == arr[i-1]) continue;

            ds.add(arr[i]);
            solution(ind+1,arr,ans, ds);
            ds.remove(ds.size()-1);
        }

    }

}