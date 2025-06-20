package project1;

public class LooseCoupling {

	public static void main(String[] args) {
		// directly we can change the object directly, because we used public in the Common class{}....
		planes obj1 = new plane1();
		planes obj2 = new plane2();
		Common c1 = new Common(obj1);
		c1.method1();
		//this is the example
		c1.plane = obj2;
		c1.method1();
		
	}

}

interface planes{
	public void planeType();
}

class plane1 implements planes{
	public void planeType() {
		System.out.print("i am the plane 1");
	}
}

class plane2 implements planes{
	public void planeType() {
		System.out.println("i am the plane 2");
	}
}

class Common{
	public planes plane;
	
	public Common(planes plane) {
		this.plane = plane;

	}
	public void method1() {
		plane.planeType();
	}
}