package class8;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to compute the average value of an array of integers 
//		except the largest and smallest values
		int[] arr = { 13, 56, 0, 8, 45,  23, 21, 89 };
		double ave = average(arr);
		System.out.println("Average value (excluding largest and smallest): " + ave);
	}
    public static double average(int[] array) {
	  if (array.length < 3) {
		  System.out.println("array must have a length of at least 3 ");
	  }
	  int sum = 0;
      int smallest = array[0];
      int largest = array[0];

      for (int i = 0; i < array.length; i++) {
          sum += array[i];
          if (array[i] < smallest) {
              smallest = array[i];
          }
          if (array[i] > largest) {
              largest = array[i];
          }
      }
      double average = (double) (sum - smallest - largest) / (array.length - 2);
      return average;

    }  
}
