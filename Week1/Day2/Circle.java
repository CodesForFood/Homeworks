package Day2;

public class Circle implements Shape{

	double radius = 4;
	
	
	@Override
	public double calculateArea() {		
		return (radius * radius) * Math.PI;
	}
	
	@Override
	public void display() {
		System.out.println("I'm a circle");
	}
	
}
