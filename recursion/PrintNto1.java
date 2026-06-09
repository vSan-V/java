import java.util.*;
public class PrintNto1
{
	public static void main(String[] args) {
        int n = 5;
		fun(n);
		System.out.println(n);
	}
	
	public static void fun(int n){
	    System.out.println(n);
	    if(n<=1){
	        return;
	    }
	    fun(n-1);
	}
}	