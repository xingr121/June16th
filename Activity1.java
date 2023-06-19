package class8;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int sz, i;
		System.out.println("Please give me the size of array ? ");
		sz = kb.nextInt();
		
		int[] arr = new int[sz];
		
		for (i = 0; i < arr.length; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = kb.nextInt();
		}
		System.out.println("Here are the values in array: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The average value of array elements is : " + averageVal(arr));
		
	}
    public static double averageVal(int[] arr) {
    	int sum = 0;
    	for (int num : arr) {
    		sum += num;
    	}
    	double average = sum / arr.length;
    	return average;
    }
}
