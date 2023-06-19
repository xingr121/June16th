package class8;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to find the number of even and odd integers in a 
//		given array of integers.
		
		int[] arr = { 13, 56, 0, 8, 45,  23, 21, 89 };
		countEvenOdd(arr);
	}
   public static void countEvenOdd(int[] array) {
	   int evenCount = 0; 
       int oddCount = 0; 
   
       for (int num : array) {
           if (num % 2 == 0) {
               evenCount++;
           } else {
               oddCount++;
           }
       }

       System.out.println("Number of even integers: " + evenCount);
       System.out.println("Number of odd integers: " + oddCount);
   }
}
