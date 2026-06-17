
import java.util.*;
public class SubSequenceSum
{
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int target = 2;
		
		subseq(0,arr,new ArrayList<Integer>(),target,0);
	}
	public static void subseq(int index, int[] arr, ArrayList<Integer> list, int target, int sum){
	    if(index >= arr.length){
	           if(sum == target){
	            System.out.println(list);
	        }	        
	        return;
	    }
	    
	    list.add(arr[index]);
	    //take
	    subseq(index+1,arr, list,target, sum+arr[index]);
	    list.remove(list.size()-1);
	    //not take
	    subseq(index+1,arr, list,target,sum);
	}
}