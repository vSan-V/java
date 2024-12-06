public class Main {
	public static void main(String args[]) {
		String name="Sanjai";
    String store="";
		for(int i = name.length()-1; i>=0; i--) {
			store = store+charAt(i);
		}
		System.out.print(store);
	}
}
