package class8;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to test two arrays' equality.
		int[] arr1 = { 12, 56, 78};
		int[] arr2 = { 12, 56, 78};
		
       if (checkEqual(arr1, arr2)) {
            System.out.println("Arrays are equal");
        }
        else {
         
            System.out.println("Arrays are not equal");
        }
		
	}
 public static boolean checkEqual(int[] arr1, int[] arr2) {
	 if (arr1.length == arr2.length) {
		 for (int i = 0; i < arr1.length; i++) {
             if (arr1[i] != arr2[i]) {
                 return false;
             }
          } 
        	  return true;
          }
	 else  {
		 return false;
	 }
		 
	 }
}
