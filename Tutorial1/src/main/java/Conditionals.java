package main;

public class Conditionals {

	public Conditionals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 7;
		int z = 10;
		
		// <> == <= >= !=
		boolean compare = x >= y  && z < y;
		// what we get is False And False; equals False
		
		boolean compare2 = x < y || z < y;
		// what we get is True Or False; equals True
		
		boolean compare3 = !(x < y || z < y);
		// what we get is Not True or Not False; equals False
		
		boolean compare4 = (x < y && y > z) || (z + 2 < 5 || x + 7 > y);
		
		// == and != can be used on Strings
//		capital letters do matter in Java
		System.out.println(compare);
		System.out.println(compare2);
		System.out.println(compare3);
		System.out.println(compare4);
	}

}
