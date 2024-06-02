package lab_program;

public class Father extends GrandFather{
	@Override
	public void properties() {
		System.out.println("father has good properties ");
		System.out.println("father  is gentel");
	}
	@Override
	public void physicalApperance() {
		System.out.println("hair is brown");
		System.out.println("height is good");
		System.out.println("skin type indian");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.properties();
		f.physicalApperance();
	}

}
