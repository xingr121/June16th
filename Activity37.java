package class8;

public class Activity37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to separate even and odd numbers from a given 
//		array of integers. Put all even numbers first, and then odd numbers.
		
		 int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		 int n = arr.length;
		int left = 0;
	    int right = n - 1;
	    System.out.println("original array: ");
	    for (int num : arr) {
	    	System.out.print(num + " ");
	}
	    System.out.println();

	    while(right >= left) {
	        if(arr[left] % 2 != 0 && arr[right] % 2 == 0) {
	        	int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	             left++;
	             right--;
	        } else {
	            if(arr[left] % 2 == 0) {
	                left++;
	            
	            }
	            if(arr[right] % 2 == 1) {
	                right--;
	            }
	        }
	    }
	    System.out.println("new array: ");
	    for (int num : arr) {
	    	System.out.print(num + " ");
	}
	    System.out.println();

	}

}
