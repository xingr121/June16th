package class8;

public class Activity31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to cyclically rotate a given array clockwise by one.
		 int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		 int n = arr.length;
		 int a = arr[n-1], i;
		 System.out.println("original array: ");
			for (i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		
		
	       for (i = n-1; i > 0; i--) {
	          arr[i] = arr[i-1];
	       }
	       arr[0] = a;
	       
	       
	       System.out.println("Here is the new array: ");
			for (i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
	}

}
