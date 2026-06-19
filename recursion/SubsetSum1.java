
import java.util.*;
public class SubsetSum1
{
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n =3;
		ArrayList<Integer> ans = new ArrayList<>();
		fun(0, arr, 0, ans, n);
		Collections.sort(ans);
		System.out.println(ans);
	}
	public static void fun(int index, int[] arr, int sum, ArrayList<Integer> ans, int n){
	    if(index>=n){
	        ans.add(sum);
	        return;
	    }
	    fun(index+1, arr, sum+arr[index], ans, n);
	    fun(index+1, arr, sum, ans, n);
	}
}