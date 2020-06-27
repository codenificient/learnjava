/**
 * 
 */
package main;

/**
 * @author ELON
 *
 */
public class BasicOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 7;
		int z = 56;
		int sum = x * y - z;
				
		System.out.println(sum);
		
		
		// division of two integers will result in an integer even if it should
//		yield a floating point number
		int a = 5;
		int b = 7;
		int c = 57;
		double div = c / b;
				
		System.out.println(div);
		
		
//		dividing a number by a double automatically yields a double
		int d = 5;
		double e = 7;
		int f = 57;
		double flot = f / e;
				
		System.out.println(flot);
		
		
//		exponents need to be in the type double
		int g = 5;
		int h = 7;
		double powr = Math.pow(g, h);
				
		System.out.println(powr);
		
//		type casting / type conversions
		int i = 5;
		int j = 7;
		double u = x / (double)y;
		double w = x / y;
		
		System.out.println(u);
		System.out.println(w);
		
		
		// modulus operator, or remainder of the division
		int k = 56 % 5; // same as 11 remainder of 1
		
		System.out.println(k);
	}

}
