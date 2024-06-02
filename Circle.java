package lab_program;

public class Circle {
	
	
	double radious;
	String color;
	

	public double getRadious() {
		return radious;
	}


	public void setRadious(double radious) {
		this.radious = radious;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	


	public Circle(double radious, String color) {
		super();
		this.radious = radious;
		this.color = color;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(1.5d,"red");		// parameat constructor 
		System.out.println(c.getRadious() + " " + c.getColor());
		
		
	}


	

}
