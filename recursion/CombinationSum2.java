import java.util.*;
public class CombinationSum2
{
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2};
		Arrays.sort(arr);
		int target = 4;
		ArrayList<List<Integer>> ans = new ArrayList<>();
		fun(0, arr,target, new ArrayList<Integer>(), ans);
		System.out.println(ans);
	}
	
	public static void fun(int ind, int[] arr, int target, ArrayList<Integer> list, ArrayList<List<Integer>> ans){
	    if(target == 0){
	        ans.add(new ArrayList<>(list));
	        return;
	    }
	    
	    for(int i= ind;i<arr.length;i++){
	        if(i>ind && arr[i]==arr[i-1]) continue;
	        if(arr[i]>target) break;
	        
	        list.add(arr[i]);
	        fun(i+1, arr, target-arr[i], list, ans);
	        list.remove(list.size()-1);
	    }
	}
}