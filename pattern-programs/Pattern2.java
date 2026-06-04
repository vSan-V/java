// *
// **
// ***
// ****
// *****


public class Pattern2
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    int val = n-i;
		    for(int j=1;j<=n-val;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}