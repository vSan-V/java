
import java.util.*;
public class fibonacci
{
	public static void main(String[] args) {
		int ans = fib(2);
		System.out.println(ans);
	}
	
	public static int fib(int n){
	    if(n<=1){
	        return n;
	    }
	    int firstCall = fib(n-1);
	    int secondCall = fib(n-2);
	    return firstCall+secondCall;
	}
}