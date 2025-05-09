import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1,2,3,3,4,5};
		int b[] = {2,3,4,4,5,6,7};
		
		HashSet set = new HashSet<>();
		for(int i = 0;i<a.length;i++){
		    set.add(a[i]);
		}
		for(int i = 0;i<a.length;i++){
		    set.add(b[i]);
		}
		
		System.out.println(set);

	}
}
