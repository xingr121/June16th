package class8;

public class Activity38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to replace every element with the next greatest 
//		element (from the right side) in a given array of integers.
//		There is no element next to the last element, therefore replace it with -1.
		int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		int n = arr.length;
		 System.out.println("Original array: ");
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
		}
        System.out.println();
		
		for (int i = 0; i < n; i++) {
            int max_value = -1;
            for (int j = i + 1; j < n; j++) {
                max_value = Math.max(max_value, arr[j]);
            }
            arr[i] = max_value;
        }
		 System.out.println("New array: ");
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
		}
        System.out.println();
		
	}

}
