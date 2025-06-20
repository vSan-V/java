package project1;

public class Abstarct_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OtherBikes2 obj1 = new OtherBikes2();
		obj1.engine();
	}

}

abstract class bike{
	abstract void engine();
}

class OtherBikes2 extends bike{
	void engine(){
		System.out.println("two cyclinder");
	}
	
}

class OtherBikes3 extends bike{


	void engine() {
		System.out.println("single cylinder");
		
	}
	
}