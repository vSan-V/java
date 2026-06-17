import java.util.*;

public class CombinationSum1
{
	public static void main(String[] args) {
	    int[] arr = {2,3,6,7};
	    int target = 7;
	    int sum =0;
	    ArrayList<List<Integer>> ans = new ArrayList<>();
	    fun(0,sum, arr, target, new ArrayList<Integer>(), ans);
		System.out.println(ans);
	}
	
	public static void fun(int i, int sum, int[] arr, int target, ArrayList<Integer> list,  ArrayList<List<Integer>> ans){
	    if(sum>= target || i>=arr.length){
	        if(sum == target){
	            ans.add(new ArrayList<>(list));
	        }
	        return;
	    }
	    list.add(arr[i]);
	    fun(i, sum+arr[i], arr, target, list, ans);
	    list.remove(list.size()-1);
	    fun(i+1, sum, arr, target, list, ans);
	    
	}
}