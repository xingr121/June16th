package class8;

public class Activity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to check if an array of integers is without 0 and -1
		
		int[] arr = { 13, 56, 0, 8, 45,  23, 21, 89 };
		boolean isWithoutZeroAndMinusOne = checkArray(arr);
		System.out.println("Array is without 0 and -1: " + isWithoutZeroAndMinusOne);
		
	}
	public static boolean checkArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == -1) {
                return false; 
            }
        }

        return true;
    }
}
