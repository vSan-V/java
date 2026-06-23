//it is a brutte force because its takes extra space as markedArr
import java.util.*;
public class Permutation1
{
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] markedArr = new int[arr.length];
		fun(arr,markedArr,new ArrayList<>());
		
	}
	public static void fun(int[] arr, int[] markedArr, ArrayList<Integer> list){
	    if(list.size() >= arr.length){
	        System.out.println(list);
	        return;
	    }
	    
	    for(int i = 0;i<arr.length;i++){
	        if(markedArr[i]==1){
	            continue;
	        }
	        list.add(arr[i]);
	        markedArr[i] = 1;
	        fun(arr,markedArr,list);
	        markedArr[i]=0;
	        list.remove(list.size()-1);
	    }
	}
}