package project1;

import java.util.Scanner;

public class IPlusOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		String b = sc.nextLine();
		
		String result = addtion(a,b);
		System.out.print(result);
		
		
	
	}
	static String addtion( String num1, String num2) {
		int total1 = 0;
		int total2 = 0;
		for(int i =0;i<num1.length();i++) {
			char c = num1.charAt(i);
			
			int value1 = c-'0';
			
			total1 = total1*10+value1;
		}
		for(int i =0;i<num2.length();i++) {
			char c = num2.charAt(i);
			int value2 = c-'0';
			
			total2 = total2*10+value2;
		}
		
		int mul = total1*total2;
		
		int num = mul;
		String result = "";
		
		while(num>0) {
			int digit = num%10;
			char c = (char)('0'+digit);
			result = c+result;
			num = num/10;
		}
		
		return result;
		
		
		
	}

}
