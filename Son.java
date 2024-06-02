package lab_program;

public class Son extends Father {
	
	@Override				
	public void properties() {			// this properties is taken by father class
		System.out.println("son has best  properties ");
		System.out.println("son  is gentel and honest");
	}
	@Override
	public void physicalApperance() {
		System.out.println("hair is brown and red");
		System.out.println("height is good");
		System.out.println("skin type indian");
	}
	public void helth() {
		System.out.println("son can play cricket ");
		System.out.println("son has no diesease");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.properties();
		s1.physicalApperance();
		s1.helth();
	}

}
