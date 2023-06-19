package class8;

public class Activity30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to count the number of possible triangles from a 
//		given unsorted array of positive integers
		 int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		 int n = arr.length;
		 int temp;
		 
		
		for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        } 
		 int count = 0;
	        for (int i = 0; i < n - 2; i++) {
	            for (int j = i + 1; j < n - 1; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    if (arr[i] + arr[j] > arr[k]) {
	                        count++;
	                    }
	                }
	            }
	        }
	        System.out.println("The number of possible triangles is: " + count);
	}

}
