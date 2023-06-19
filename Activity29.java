package class8;

public class Activity29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to find all combinations of four elements of an array 
//		whose sum is equal to a given value
		
        int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		int givenInt = 87;
		int n = arr.length;
	    System.out.println("Given value: "+ givenInt);
	    System.out.print("Combination of four elements:");  
	        for (int i = 0; i < n - 3; i++) {
	            for (int j = i + 1; j < n - 2; j++) {
	              for (int k = j + 1; k < n - 1; k++) {
	                    for (int l = k + 1; l < n; l++) {
	                        if (arr[i] + arr[j] + arr[k] + arr[l] == givenInt) 
	     System.out.println(arr[i]+" "+arr[j]+" "+arr[k] + " "+arr[l]);
	                                                                 
	                    }
	                }
	            }
	        }
	}

}
