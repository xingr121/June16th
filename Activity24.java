package class8;

public class Activity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to check if the sum of all the 10's in the array is 
//		exactly 30. Return false if the condition does not satisfy, otherwise true.
		
		int[] arr = { 13, 56, 10, 8, 45,  23, 21, 89 };
		boolean isSum30 = checksum(arr);
		System.out.println("Sum of all the 10's is exactly 30: " + isSum30);
		
	}
    public static boolean checksum(int[] array) {
    	int sum = 0;
    	for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                sum += array[i];
            }
        }
    	 if (sum == 30) {
             return true; 
         } else {
             return false; 
         }
    }
}
