import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1,2,3,3,4,5};
		int b[] = {2,3,4,4,5,6,7};
		
		ArrayList<Integer> list = new ArrayList<>();
        
        int i =0;
        int j= 0;
        while(i<a.length && j<b.length){
            
            if(list.size()==0){
                list.add(a[i]);
                i++;
                continue;
            }
            if(a[i]<b[j]){
                if(a[i]!=list.get(list.size()-1)){
                    list.add(a[i]);
                }
                i++;
                
            }
            else{
                if(b[j]!=list.get(list.size()-1)){
                    list.add(b[j]);
                }
                j++;
            }
            
        }
        while(i<a.length){
            if(a[i]!=list.get(list.size()-1)){
                list.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(b[j]!=list.get(list.size()-1)){
                list.add(b[j]);
            }
            j++;
        }
   System.out.println(list);
        
	}
}
