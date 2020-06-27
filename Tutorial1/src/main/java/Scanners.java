/**
 * 
 */
package main;
import java.util.Scanner;

/**
 * @author ELON
 *
 */
public class Scanners {

	/**
	 * 
	 */
	public Scanners() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		int nexInt = sc.nextInt();
		boolean bol = sc.nextBoolean();
		double googl = sc.nextDouble();
		
		int x = Integer.parseInt(scanned);
		
				
		System.out.println(scanned);
		System.out.println(nexInt);
		System.out.println(bol);
		System.out.println(googl);
		System.out.println(x);
	}
}
