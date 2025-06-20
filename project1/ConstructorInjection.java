package project1;

public class ConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new cat();
		Animal obj = new Dog();
		Call obj2 = new Call(obj);
		obj2.callMethod();
		obj2.animal = obj1;
		obj2.callMethod();
		
		//This program we also changed directly of the object of the class, Becoz the animal object is in public.
		
		


	}

}

interface Animal{
	public void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("bow bow");
	}
}
class cat implements Animal{
	cat(){
		System.out.println("i am the cat");
	}
	public void sound() {
		System.out.println("meow meow");
	}
}
class Call{
	public Animal animal;
	
	Call(Animal anim){
		this.animal = anim;
		System.out.println(animal);
	}
	public void callMethod() {
		animal.sound();
		
	}
}