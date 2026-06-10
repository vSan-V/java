
import java.util.*;
public class CheckPalindrome
{
	public static void main(String[] args) {
		String s = "ABCBA";
		boolean ans = palindrome(s,0,s.length()-1);
		System.out.println(ans);
		
	}
	
	public static boolean palindrome(String s, int l ,  int r){
	    if(l>=r){
	        return true;
	    }
	    if(s.charAt(l) != s.charAt(r)){
	        return false;
	    }
	    return palindrome(s,l+1,r-1);
	}
}