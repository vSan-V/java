package project1;

public class static_keyword {
	

	public static void main(String[] args) {
		//Output is 2, Because of 2 objects are created.
		Friends obj1 = new Friends("mani");
		Friends obb2 = new Friends("arul");
		
		Friends.display();
		
	}

}

class Friends{
	
	String name;
	static int numberOfFriends;
	
	 Friends(String name){
		this.name = name;
		numberOfFriends++;
	}
	 
	 static void display() {
		 System.out.println("number of friends is"+" "+  numberOfFriends);
	 }
}

