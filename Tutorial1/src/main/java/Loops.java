package main;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x = 0; x <= 7; x+=2) {
			System.out.println(x);
		}
		
		int[] arr = {1, 5, 7, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				System.out.println("Found a 5! at index " + i);
			}
		}
	}

}
