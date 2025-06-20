package project1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ParaArray {

	public static void main(String[] args) {
		int[] arrays = {1,2,3,4,5};

		System.out.println(Arrays.toString(array(arrays)));
		
		System.out.println(Arrays.toString( swapRange(arrays, 0,4)));
		
		String a = "sanjai";
	
	
			System.out.println(reverse( a, 0,5));
		
		

	}
	static int[] array(int[] a) {
		int start = 0;
		int end  = a.length-1;
		int temp;
		
		while(start<end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
	
		}
		return a;
		
	}
	
	static int[] swapRange(int[] a, int start, int end) {

		int temp;
		
		while(start<end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
	
		}
		return a;
		
	}
	
	static String reverse(String a, int start, int end) {
		char[] chars = a.toCharArray();
		char temp; 	 	
		
		while(start<end) {
			temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			
			start++;
			end--;
	
		}
		//return new String(chars);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<chars.length;i++) {
			sb.append(chars[i]);
		}
		return sb.toString();
		
	}

}
