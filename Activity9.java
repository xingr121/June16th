package class8;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find duplicate values in an array of integer values.
		
		int[] arr = { 13, 56, 78, 8, 94, 67, 67, 23, 21, 89, 94 };
		System.out.println("the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate value : "+ arr[j] );
                }
            }
        }
	}

}
