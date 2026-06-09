import java.util.*;
public class SumValue1toN
{
	public static void main(String[] args) {
        int n = 5;
        int sum =0;
		int waitSum = sum(1, n, sum);
		System.out.println(waitSum);
	}
	
	public static int sum(int count, int n,int sum){
	    sum = sum+count;
	    if(count>=n){
	        return sum;
	    }
	    return sum(count+1,n,sum);
	}
}	