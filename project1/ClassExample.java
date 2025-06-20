package project1;

public class ClassExample {

	public static void main(String[] args) {
		Example1 obj1 = Example1.getMethod();
;		System.out.println(obj1);
		

	}

}

class Example1{
	private static Example1 example1;
	private Example1() {
		System.out.println("This is the default constructor");
	}
	public static Example1 getMethod() {
		if(example1 == null) {
			example1=new Example1();
		}
		return example1;
	}	
}
