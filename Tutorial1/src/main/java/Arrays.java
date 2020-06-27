package main;
import java.util.Scanner;

public class Arrays {

	public Arrays() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] newArr = new String[5];
		
		newArr[0] = "tim";
		newArr[1] = "chris";
		newArr[2] = "bill";
		newArr[3] = "Joe";
		newArr[4] = "world";
		
		int[] nums = {2, 4, 5, 7, 9, 14};
		
		double[] nums2 = {3.2,4.6};
		
		String x = newArr[3];
		int num = nums[3];
		double googl = nums2[1];
		
		System.out.println(x + " has probably a " + num + "th grade GPA of " + googl);
	}

}
