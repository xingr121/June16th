package class8;

public class Activity33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to arrange the elements of an array of integers so 
//		that all negative integers appear before all positive integers.
		
		int[] arr = { -13, -56, -8, 45,  23, -21, 89, 45, -43, 21 };
		arrange(arr);
		System.out.println("Array after arranging: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
  public static void arrange(int[] array) {
 
      int j = 0, temp;
      for (int i = 0; i < array.length; i++) {
    	  if (array[i] < 0) {
          if (i != j) {
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
                  
              }
          j++;
          }
      }
  }
}

