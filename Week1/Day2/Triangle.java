package Day2;

public class Triangle implements Shape {

	double base = 5;
	double height = 7;
	
	@Override
	public double calculateArea() {
		double area = (base * height) / 2;
		return area;
	}

	@Override
	public void display() {
		System.out.println("I am a triangle");
		
	}

	
}
