package class8;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to remove a specific element from an array.
		int[] arr = { 13, 56, 78, 8, 94 };
		System.out.println("the original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int removeIndex = 1;
		
		if (arr == null || removeIndex < 0 || removeIndex > arr.length) { 
	 
	   System.out.println("No removal operation can be performed!!");
		}
	   
	   int[] newArray = new int[arr.length - 1];
	   for (int i = 0, j = 0; i < arr.length; i++) { 
		   
           if (i == removeIndex) { 
               continue; 
           } 
           newArray[j++] = arr[i]; 
       } 
	   System.out.println("this is a Array after removal operation:");
	  
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println();

}
	}
