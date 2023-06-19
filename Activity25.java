package class8;

public class Activity25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to check if an array of integers contains two 
//		specified elements 65 and 77
		int[] arr = { 13, 56, 10, 8, 45,  23, 21, 89 };
		
		boolean containElements = checkArray(arr, 65, 77);
		System.out.println("Array contains elements 65 and 77: " + containElements);
		
	}
	public static boolean checkArray(int[] array, int element1, int element2) {
        boolean containsElement1 = false;
        boolean containsElement2 = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element1) {
                containsElement1 = true;
            }
            if (array[i] == element2) {
                containsElement2 = true;
            }
        }

        if (containsElement1 && containsElement2) {
            return true;
        } else {
            return false;
        }
    }
}
