package project1;


//This code contain both of String to integer and integer to string without inbuilt method;
import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String value = strToChar(a);
		System.out.print(value);
		sc.close();

	}
	static String strToChar(String num1) {
		int value1=0;
		int store=0;
		for(int i = 0;i<num1.length();i++) {
			char ch = num1.charAt(i);
			
			value1 =ch-'0';
			
			store = store*10+value1;//123	
			
		}
		
		int store2 = store;
		String rvalue ="";
		while(store2>0) {
			int temp = store2%10;
			char ch = (char)('0'+temp);
			rvalue = ch+rvalue;
			store2 = store2/10;
		}
		
		return rvalue;
	}

}
