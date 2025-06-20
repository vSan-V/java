package project1;

public class Encapsulation {

	public static void main(String[] args) {
		army obj1 = new army();
		army obj2 = new army();
		
		obj1.setId(001);
		obj1.setName("dinesh");
		obj2.setId(002);
		obj2.setName("rajesh");
		System.out.println(obj1.getId()+" "+ obj1.getName());
		System.out.println(obj2.getId()+" "+ obj2.getName());

	}

}

class army{

	static int num=1;
	private int id; 
	private String name;
	
	army(){
		System.out.println(num++);
	}
	
	void setId(int armyId){
		this.id = armyId;
	}
	void setName(String armyName) {
		this.name = armyName;
	}
	
	int getId() {
		return id;
	
	}
	String getName() {
		return name;
	}
}
