import java.util.*;
public class PrintName
{
	public static void main(String[] args) {
        String name = "sanjai";
        int count = 0;
		fun(name,count);
	}
	
	public static void fun(String name, int count){
	    if(count>=5){
	        return;
	    }
	    System.out.println(name);
	    count++;
	    fun(name,count);
	}
}	