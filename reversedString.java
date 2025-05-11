public class Main {
	public static void main(String args[]) {
		String name="Sanjai";
		char[] store = new char[name.length()];
		for(int i = name.length()-1; i>=0; i--) {
			store[i]=name.charAt(name.length()-i-1);
		}
		String reversed = new String(store);
		System.out.print(reversed);
	}
}
