import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows in stairs or pyramid?");
		int rows = scanner.nextInt();					
		displayStairs(rows);
		
		printDivider();
		displayStairsReverse(rows);
		
		printDivider();
		displayPyrimid(rows);
		
		printDivider();
		displayPyrimidReverse(rows);
	}
	
	public static void displayStairs(int rows) {		
		for(int i = 1; i <= rows; i++) {
			printStar(i);
			System.out.print("\n");	
		}		
	}	
	
	public static void displayStairsReverse(int rows) {
		for(int i = rows; i > 0; i--) {
			printStar(i);
			System.out.print("\n");	
		}
	}
	
	public static void displayPyrimid(int rows) {	
		int maxCol = (rows * 2) - 1;
		
		for(int i = 1; i <= rows; i++) {
			int spaces = rows - i;
			int stars = (i * 2) - 1;
			printSpace(spaces);
			printStar(stars);
			printSpace(spaces);
			System.out.print("\n");			
		}				
	}
	
	public static void displayPyrimidReverse(int rows) {
		int maxCol = (rows * 2) - 1;
		
		for(int i = rows; i > 0; i--) {
			int spaces = rows - i;
			int stars = (i * 2) - 1;
			printSpace(spaces);
			printStar(stars);
			printSpace(spaces);
			System.out.print("\n");			
		}	
	}
	
	public static void printDivider() {
		System.out.println("===========================");
	}
	
	public static void printSpace(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printStar(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}							
	}
	
	
}
