package class8;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements
		int[] arr = { 13, 56, 0, 8, 0, 45, 0, 23, 21, 89 };
		moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to the end: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
	}
	public static void moveZerosToEnd(int[] array) {
        int count = 0; 

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] != 0) 
            {
                array[count] = array[i];
                count++;
            }
        }

        while (count < array.length) 
        {
            array[count] = 0;
            count++;
        }
}
}
