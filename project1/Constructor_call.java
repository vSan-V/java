package project1;

public class Constructor_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		Student obj2 = new Student("sanjai", 99);
		Student obj3 = new Student("sanjai", 99);
		Student obj4 = new Student();
//		obj2.name="sanjai";
//		obj2.mark=88;

		System.out.println(obj2.name+" "+obj2.mark);
	}

	
}

class Student{
	String name;
	int mark;

	Student(){
		System.out.println("This is the default constructor");

	}
	Student(String a, int b){
		name = a;
		mark = b;
	}
}
