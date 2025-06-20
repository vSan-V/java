package project1;

public class Interface_Class {

	public static void main(String[] args) {
		soldier obj1 = new soldier();
		obj1.show();      
		obj1.bossName2();
		//obj1.veteranName();
	}
	
}
interface boss{
	default void bossName() {
		System.out.println("I am the boss");
	}
	 public void bossName2();

}

interface veteran{
	default void veteranName() {
		System.out.println("I am the veteran");
	}
}

class soldier implements veteran, boss{
	public void show() {
		veteran.super.veteranName();
	}
	 public void bossName2(){
		System.out.println("bossName2");
	}
	
}