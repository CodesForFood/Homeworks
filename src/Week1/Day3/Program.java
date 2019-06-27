package Week1.Day3;

import java.util.Scanner;
import java.io.*;

public class Program {

	public static void main(String[] args) {
		Program prog = new Program();
		
		prog.getDirectory();
		
	}
	
	
	public void getDirectory() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the absolute path of the directory.");
		String dir = scanner.nextLine();
		
		File file = new File(dir);
		
		
		if(file.exists() && file.isDirectory()) {
			for(String fileName : file.list()) {
				System.out.println(fileName);
			}
		}
		else {
			System.out.println("There is something wrong with that path");
		}
		
		scanner.close();
		
	}
	
}
