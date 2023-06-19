package class8;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 13, 8, 78, 76, 94 };
		System.out.println("Index of 8 is : " + findIndex(arr, 8));
	}
   public static int findIndex(int[] myarr, int num) {
	   for (int i = 0; i < myarr.length; i++) {
		   if (myarr[i] == num) {
			   return i;
		   }
	   }
	   return -1;
   }
}
