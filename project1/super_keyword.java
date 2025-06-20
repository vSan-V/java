package project1;

public class super_keyword {

	public static void main(String[] args) {
		bmw obj1 = new bmw();

	}

}

class CAR{

	//String name;
	CAR(String name){
		//this.name = name;
		System.out.println(name);
	}
}
class bmw extends CAR{
	bmw(){
		super("car");
		System.out.println("bmw");
	}
}
