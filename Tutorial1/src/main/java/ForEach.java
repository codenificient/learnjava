package main;
import java.util.Scanner;

public class ForEach {
	
	public static void main(String[] args) {
		
	int[] arr = {1, 5, 7, 3, 4, 5};
	
	
	int count = 1;
	for (int element:arr) {
		System.out.println(count + " " + element);
		count++;
	}
	
	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i < names.length; i++) {
		
		// will ask user their name five times
		System.out.print("Your name: ");
		String input = sc.nextLine();
		names[i] = input;
		
		
	}
	
	// will print user name five times after saving inputs to variable n
	for (String n:names) {
		System.out.println(n);
		
		//  will try to print all five names recorded, 
//		but if we encounter chris, we'll stop
		if (n.equals("chris")) {
			break;
		}
	}
}
}
