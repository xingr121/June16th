package class8;

public class Activitty21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to get the difference between the largest and 
//		smallest values in an array of integers. The array must have a length of at 
//		least 1
		int[] arr = { 13, 56, 0, 8, 45,  23, 21, 89 };
		int difference = difference(arr);
		System.out.println("Difference between largest and smallest values: " + difference);
	}
  public static int difference(int[] array) {
	  if (array.length < 1) {
		  System.out.println("array must have a length of at least 1 ");
	  }
	  int largest = array[0];
      int smallest = array[0];

      for (int i = 1; i < array.length; i++) {
          if (array[i] > largest) {
              largest = array[i];
          }
          if (array[i] < smallest) {
              smallest = array[i];
          }
      }

      int difference = largest - smallest;

      return difference;
  }
}
