package class8;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to reverse an array of integer values.
		int[] arr = { 13, 56, 78, 8, 94, 45, 67, 23, 21, 89 };
		System.out.println("the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int start = 0; 
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("the reversed array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
        
	}
		
	}

}
