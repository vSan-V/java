package project1;

public class StringReturn {

	public static void main(String[] args) {

		ReturnString obj1= new ReturnString();
		String name = obj1.naming("sanjai");
		System.out.println(name);
		
		String name2= obj1.twoPointer("sanjai");
		System.out.println(name2);

	}

}

class ReturnString{

	public String naming(String name) {
   char[] store = new char[name.length()];
		
		 for(int i = name.length()-1;i>=0;i--) {
			 store[i] = name.charAt(name.length()-i-1);
		 }
		 
		 String name2 = new String(store);
		 
		 return name2;
			 
		 
	}
	
	public String twoPointer(String name) {
		int start=0;
		int end = name.length()-1;
		char[] store = name.toCharArray();
		char temp=0;
		
		while(start<end) {
			temp =store[start];
			store[start] = store[end];
			store[end] = temp;
			
			start++;
			end--;
			
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<store.length;i++) {
			sb.append(store[i]);
		}
		return sb.toString();
	}
}
