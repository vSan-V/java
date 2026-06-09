import java.util.*;
public class PrintNumToN
{
	public static void main(String[] args) {
        int num = 5;
		fun(num,1);
	}
	
	public static void fun(int num, int count){
	    	    System.out.println(count);
	    if(count>=5){
	        return;
	    }
	    fun(num,count+1);
	}
}	