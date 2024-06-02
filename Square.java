package lab_program;

public class Square extends Shape {
	
	@Override
	public   void area() {
		int width=5;
		int height=2;
		int area_of;

		area_of =height*width;
		System.out.println(area_of);
	}	


	
	
	public static void main(String[] args) {

		
		Square s1= new Square();
		
		Shape s2=new Shape();
		s2.area();
		s2.area();
		
	}


	

}
