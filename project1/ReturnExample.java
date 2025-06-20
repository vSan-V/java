package project1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReturnExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Return obj1 = new Return();
		int size = sc.nextInt();

		
		System.out.println(Arrays.toString(obj1.arrays(size)));

	}


}
class Return{
	public int[] arrays(int size) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[size];
		
		for(int i=0;i<size;i++) {
			input[i] = sc.nextInt();
		}
		
		return input;
	}
}