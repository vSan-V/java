package project1;

public class Polymorphism {

	public static void main(String[] args) {
		
		//compile time polymorphism
		Add obj1 = new Add();
		int add1 = obj1.add(2, 3);
		int add2= obj1.add(2, 4, 5);
		System.out.println(add1);
		System.out.println(add2);
		
		//run time polymorphism
		NameOfNames obj2 = new NameOfNames();
		obj2.stName();
		
		
		
	}

}

//Compile time polymorphsim
class Add{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
}

//runtime polymorphism
class Name{
	public void stName() {
		System.out.println("I am the parent class");
	}
}


class NameOfNames extends Name{
	public void stName() {
		System.out.println("I am the derived class");
	}
}