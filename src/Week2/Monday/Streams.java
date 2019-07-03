package Week2.Monday;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Streams {
	

	
	
	public static void main(String[] args) {
		System.out.println("===============================================Part 1");
		runPart1();
		System.out.println("=============================================Part 2");
		runPart2();
		System.out.println("=============================================Part 3");
		runPart3();
	}
	
	public static void runPart1() {
		String[] strArray = {"Apple", "Bandana", "Tom", "Super", "Employee", "Easter", "Echo" };
		
		Arrays.stream(strArray).forEach(System.out::println);	
		
		System.out.println("==================Sorted By Length=======================================");
		//Sort by length
		Arrays.stream(strArray)
			.sorted((str1, str2) -> str1.length() - str2.length())
			.forEach(System.out::println);
		
		System.out.println("=================Sorted By Length Reverse========================================");
		
		// reverse Length
		Arrays.stream(strArray)
			.sorted((str1, str2) -> str2.length() - str1.length())
			.forEach(System.out::println);
		
		
		System.out.println("==================Alphabetical Order======================================");
		Arrays.stream(strArray)
			.sorted((str1, str2) -> str1.charAt(0) - str2.charAt(0))
			.forEach(System.out::println);
		
		System.out.println("=================Starts with 'e' first======================================");
		
		Arrays.stream(strArray)
			.sorted((str1, str2) -> {
				if(str1.toLowerCase().startsWith("e")) {
					return -1;
				}
				else {
					return 1;
				}
		}).forEach(System.out::println);
			
		
		System.out.println("=================Starts with 'e' first with helper======================================");
		Arrays.sort(strArray, (str1, str2) -> startsWithE(str1, str2));
		Arrays.stream(strArray).forEach(System.out::println);	
	}
	
	public static int startsWithE(String str1, String str2) {
		if(str1.toLowerCase().startsWith("e")) {
			return -1;
		}
		else {
			return 1;
		}		
	}
	
	/*
	 *  returns a comma separated string based on a given list of integers. 
	 *  Each element should be preceded by the letter 'e' if the number is even, 
	 *  and preceded by the letter 'o' if the number is odd. 
	 */	
	public static void runPart2() {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(65);
		intList.add(55);
		intList.add(2);
		intList.add(8);
		intList.add(13);
		intList.add(9);		
		
		var csv = intList.stream()
				.map((num) -> num % 2  == 0 ? "e" + num : "o" + num)
				.collect(Collectors.joining(","));
		
		System.out.println(csv);						
	}
	
	
	/*
	 * write a method that returns a list of all strings that 
	 * start with the letter 'a' (lower case) and have exactly 3 
	 */
	
	public static void runPart3() {
		List<String> strList = new ArrayList<String>();		
		strList.add("Toy");
		strList.add("Apple");
		strList.add("Art");
		strList.add("Band");
		strList.add("Java");
		strList.add("And");
		strList.add("Tip");
		strList.add("arg");
		
		
		strList.stream()
			.filter((str) -> str.toLowerCase().startsWith("a") && str.length() == 3)
			.collect(Collectors.toList())
			.forEach(System.out::println);				
	}
	
	
	
	
	
}
