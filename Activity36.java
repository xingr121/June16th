package class8;

public class Activity36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program that separates 0s on the left hand side and 1s on the 
//		right hand side from a random array of 0s and 1
		int[] arr = { 0, 0, 1, 1, 0, 1, 1, 1,0 };
        int n = arr.length;
        System.out.println("original array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
        
        int count = 0;   
	     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
 
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
        
        System.out.println("New array: ");
        
        for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
	}

}
