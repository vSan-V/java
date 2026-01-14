import java.util.*;
class CombinationSum1 {
    public static void main(String[] args) {
       int[] combination ={2,3,6,7};
       int target = 7;
       List<List<Integer>> ans = combinationSum(combination, target);
       System.out.println(ans);

    }
    public static List<List<Integer>> combinationSum(int[] combination, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        fun(index,combination,target, ans, new ArrayList<Integer>());
        return ans;
    }
    public static void fun(int index, int[] arr, int target,List<List<Integer>> ans, List<Integer> ds){
        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            fun(index,arr, target-arr[index], ans,ds);
            ds.remove(ds.size()-1);
        }
        fun(index+1,arr, target,ans,ds);

    }
}