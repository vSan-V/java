import java.util.*;


public class Main
{
	public static void main(String[] args) {
		int arr[] = {10,5,2,7,1,-10};
		int k=10;
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum=0;
		int max=0;
		int size=0;
		int rem=0;
		for(int i=0;i<arr.length;i++){
		    sum = sum+arr[i];
		    
		    if(sum==k){
		        size =i+1;
		    }
		    if(max<size){
		        max=size;
		    }
		    rem=sum-k;
		    
		    if(hm.containsKey(rem)){
		        size = i-hm.get(rem);
		        if(max<size){
		            size=max;
		        }
		    }
		    if(!hm.containsKey(sum)){
		        hm.put(sum, i);
		    }
		    
		}
		System.out.println(rem);
	}
}