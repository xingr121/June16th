package class8;

public class Activity32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the rotation count in a given rotated sorted 
//		array of integers.
		int[] arr = { 15, 18, 2, 3, 6, 12 };
		int min = arr[0], minIndex = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (min > arr[i]) {
	            min = arr[i];
	            minIndex = i;
	        }
	    }
	    System.out.println("Rotation count: " + minIndex);
	}

}
