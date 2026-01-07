public class MinimumMovesToConvertString
{
	public static void main(String[] args) {
		String s = "XXOOX";
		int check=0;
		int i=0;
		while(i<s.length()){
		    char ch = s.charAt(i);
		    if(ch=='X'){
		        check++;
		        i=i+2;
		    }
		    i++;
		}
		System.out.println(check);
	}
}