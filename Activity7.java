package class8;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the maximum and minimum value of an array.
		int[] arr = { 13, 56, 78, 8, 94, 45, 67, 23, 21, 89 };
		System.out.println("the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
                
        }
		}
        System.out.println("the maximum value : " + max);
        System.out.println("the minimum value : " + min);

	}

}
