package project1;

public class UnderstandingThis {

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.setValue(5,obj1);
		System.out.println(obj1.getValue());
		
		
	}

}

class A{
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value, A obj1) {
		A obj = obj1;
		obj.value = value;
		System.out.println(value);
	}
		 
	
}
