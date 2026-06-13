
import java.util.*;
public class SubSequence
{
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		subseq(0,arr,new ArrayList<Integer>());
	}
	public static void subseq(int index, int[] arr, ArrayList<Integer> list){
	    if(index >= arr.length){
	        System.out.println(list);
	        return;
	    }
	    list.add(arr[index]);
	    subseq(index+1,arr, list);
	    list.remove(list.size()-1);
	    subseq(index+1,arr, list);
	}
}