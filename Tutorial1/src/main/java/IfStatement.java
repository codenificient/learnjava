package main;
import java.util.Scanner;

public class IfStatement {

	public IfStatement() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("chris")) {
			System.out.println("You typed Chris!");
		}
		
	
		else if (s.equals("hello")) {
			System.out.println("They said hello");
		}
		
		else {
			System.out.println("Print outside if Statement");
		}
	}
		
}
