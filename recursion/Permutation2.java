import java.util.*;
public class Permutation2
{
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		fun(0, arr);
	}
	public static void fun(int index, int[] arr){
        	 if(index>=arr.length){
	         System.out.println(Arrays.toString(arr));
	         return;
	        }
	    for(int i = index;i<arr.length;i++){
	        swap(i,index,arr);
	        fun(index+1,arr);
	        swap(i,index,arr);
	    }
	}
	public static void swap(int i, int index, int[] arr){
	    int temp = arr[i];
	    arr[i] = arr[index];
	    arr[index] = temp;
	    return;
	}
}