package Week1.Day2;

public class Rectangle implements Shape{

	double width = 4;
	double height = 5;
	
	@Override
	public double calculateArea() {		
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Im a rectangle");
		
	}

	
}
