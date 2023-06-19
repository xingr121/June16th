package class8;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 13, 56, 78, 8, 94 };

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int val = kb.nextInt();

        boolean containsValue = contains(arr, val);

        if (containsValue) {
            System.out.println("The array contains the value.");
        } else {
            System.out.println("The array does not contain the value.");
        }
	}
   public static boolean contains(int[] arr, int value) {
	   for(int num : arr) {
		   if (num == value) {
			   return true;
		   }
	   }
	   return false;
   }
}
