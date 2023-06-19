package class8;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find common elements between two integer arrays.
		int[] arr1 = { 13, 56, 78, 8, 94, 67, 67, 23, 21, 89, 94 };
		int[] arr2 = {56, 89, 46, 34, 28, 91, 94};
		 for (int i = 0; i < arr2.length; i++)
	        {
	            for (int j = 0; j < arr1.length; j++)
	            {
	                if(arr2[i] == arr1[j])
	                {
	                    System.out.println(arr2[i]);
	                }
	            }
	        }
	}

}
