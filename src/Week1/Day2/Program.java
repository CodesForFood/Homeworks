package Week1.Day2;

public class Program {

	public static void main(String[] args) {
		sumArgs(args);
		
		biggestOfArray();
		
		interfacePractice();
		
	}	
	
	public static void biggestOfArray() {
		int[][] array = {{5, 4, 7,},
						 {13, 15, 2},
						 {14, 3, 8}};
		
		int maxNum = 0;
		String position = "";
		
		for(int y = 0; y < array.length; y++) {
			for(int x = 0; x < array[0].length; x++) {
				if(array[x][y] > maxNum) {
					maxNum = array[x][y];
					position = x + ":" + y;
				}
			}
		}
		
		System.out.println("Biggest number is " + maxNum);
		System.out.println("Its at position " + position);			
	}
	
	public static void interfacePractice() {
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		cir.display();
		System.out.println("The area is " + cir.calculateArea());
		
		rect.display();
		System.out.println("The area is " + rect.calculateArea());
		
		tri.display();
		System.out.println("The area is " + tri.calculateArea());
		
	}
	
	
	
	public static boolean tryParseInt(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException ex) {
			return false;
		}
	}
	
	
	public static void sumArgs(String[] args) {
		int total = 0;
		for(String arg : args) {
			if(tryParseInt(arg)) {
				int num = Integer.parseInt(arg);
				total += num;
			}
		}
		
		System.out.println("The total is " + total);
	}
	
	
}
