package class8;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find a missing number in an array
		int[] arr = { 1, 3, 4, 5, 6 };
		
		int missingNum = findMIssingNumber(arr);
		
		System.out.println("Missing number: " + missingNum);
		
		
	}
  public static int findMIssingNumber(int[] array) {
	  int n = array.length;
      int totalSum = (n + 1) * (n + 2) / 2;
      
      int arraySum = 0;
      for (int num : array) {
          arraySum += num;
      }
      
      return totalSum - arraySum;
  }
}
