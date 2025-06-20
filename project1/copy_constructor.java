package project1;

public class copy_constructor {

	public static void main(String[] args) {
		copyConstructor obj1 = new copyConstructor("arul", 2000);
		copyConstructor obj2 = new copyConstructor(obj1);
		obj2.display();
	
//		obj1.name="karthi";
//		obj1.year= 2000;
//		obj1.display();

		
		
	}
}

class copyConstructor{
	
	String name;
	int year;
	copyConstructor(){
		System.out.println("this is a deault constructor");
		
	}
	
	copyConstructor(String a, int b){
		this.name= a;
		this.year = b;
	}
	
	copyConstructor(copyConstructor cc){
		this.name = cc.name;
		this.year = cc.year;
		
	}
	
	void display() {
		System.out.println(name+ " "+year);
	}
}
