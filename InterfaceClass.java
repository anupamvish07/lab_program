package lab_program;

public class InterfaceClass implements FanInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FanInterface i=new InterfaceClass();
		i.read();
		System.out.println(i.age);
	}
	@Override
	public void read() {
		System.out.println("read method form interface");
	}

}
