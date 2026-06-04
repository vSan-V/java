//     *
//    ***
//   *****
//  *******
// *********


public class Pattern4
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    int val = n-i;
		    for(int k=1;k<=val;k++){
		        System.out.print(" ");
		    }
		    for(int j=n-i+1;j<=n+i-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}