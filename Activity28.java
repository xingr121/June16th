package class8;

public class Activity28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the sum of the two elements of a given array 
//		equal to a given integer.
		int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		
		int givenInt = 107;
		int sum;
		
		
		 for (int i=0;i<arr.length;i++)
		    {
		      for (int j=i ; j<arr.length;j++){


		        sum = arr[i] + arr[j];
		        if (sum == givenInt ){

		          System.out.println(arr[i] + " " + arr[j]);

		        }
	}
		    }

}
}
