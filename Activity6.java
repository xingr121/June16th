package class8;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 13, 56, 78, 8, 94 };
		int[] newArr = new int[arr.length + 1];
		
		int indexPosition = 2;
		int insertValue = 79;
		
		System.out.println("the original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i= 0; i < newArr.length; i++){
		   if (i < indexPosition) {
			newArr[i] = arr[i];
		   } else if (i == indexPosition) {
			   newArr[i] = insertValue;
		   } else {
			   newArr[i] = arr[i-1];
		   }
		}
		   
		   
		   System.out.println("New Array: ");
		   for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
	}

}
