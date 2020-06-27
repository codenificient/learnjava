package main;
import java.util.Scanner;

public class DowhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
		} while (x != 11);
		
	}

}

