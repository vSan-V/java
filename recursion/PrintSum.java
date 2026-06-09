//basic recursion
public class PrintSum
{
	public static void main(String[] args) {
		sum(0,3);
		sum2(0,0,5);
		int sum3 = sum3(3);
		System.out.println("sum3: "+sum3);
	}
	public static void sum(int sum,int i){
	    if(i<=0){
	        System.out.println(sum);
	        return;
	    }
	    sum=sum+i;
	    sum(sum, i-1);
	}
	
	public static void sum2(int sum, int i, int n){
	    sum = sum+i;
	    if(i>=n){
	        System.out.println("sum2: "+ sum);
	        return;
	    }
	    sum2(sum, i+1,n);
	}
	
	//this is a functional way to sum the values 
	public static int sum3(int n){
	    if(n<=0){
	        return 0;
	    }
	    int val = n+sum3(n-1);
	    return val;
	}
	
}