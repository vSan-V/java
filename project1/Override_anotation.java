package project1;

public class Override_anotation {

	public static void main(String[] args) {
		son obj1 = new son();
		obj1.dad();


	}

}

class IamDad{
	void dad() {
		System.out.println("i am your dad");
	}
}
class IamMom extends IamDad{
	void dad() {
		System.out.println("you are my husband");
	}
}
class son extends IamMom{
	@Override
	void dad() {
		System.out.println("you are my dad");
	}
	
	void dada() {
		System.out.println("you are my dad");
	}
	
}