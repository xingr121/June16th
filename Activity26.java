package class8;

public class Activity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to remove duplicate elements from a given array and 
//		return the updated array length.
		 int[] arr = { 13, 8, 78, 8, 94, 45, 67, 94, 21, 89 };
			System.out.println("Original Array : ");
	       
	       for (int i = 0; i < arr.length; i++)
	       {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	       int lenOfNewArr = lengthOfNewarr(arr);
	       System.out.println("the updated array length: " + lenOfNewArr);
		
	}
   public static int lengthOfNewarr(int[] arr) {
       
       int count = arr.length;
       for (int i = 0; i < count; i++) 
       {
           for (int j = i+1; j < count; j++) 
           {
		if(arr[i] == arr [j])
		{
			arr[j] = arr[count -1];
			count--;
			j--;
		}
	}

}
       int[] newArr = new int[count];
       for (int i = 0; i < count; i++) {
       	newArr[i] = arr[i];
       
       }
       System.out.println("array with unique value: ");
        for (int i = 0; i < count; i++) {
       	System.out.print(newArr[i] + " ");
   }
        System.out.println();
        return count;
}
}
