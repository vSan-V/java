//basic recursion
public class Factorial
{
	public static void main(String[] args) {
		int op = fact(5);
		System.out.println(op);
	}
	public static int fact(int num){
	    if(num==1){
	        return 1;
	    }
	    return num*fact(num-1);
	}
}