import java.util.*;
public class PrintNto1Backtracking
{
	public static void main(String[] args) {
        int n = 5;
		fun(1, n);
	}
	
	public static void fun(int count, int n){
	    if(count>=n+1){
	        return;
	    }
	    fun(count+1,n);
	    System.out.println(count);
	}
}	