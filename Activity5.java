package class8;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to copy an array by iterating the array.
		
		int[] arr = { 13, 56, 78, 8, 94 };
		int[] copyArr = new int[arr.length];
		System.out.println("the original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) { 
			   
	           copyArr[i] = arr[i]; 
	       } 
		   
		System.out.println("new Array :");
		  
			for (int i = 0; i < copyArr.length; i++) {
				System.out.print(copyArr[i] + " ");
			}
			System.out.println();
	}

}
