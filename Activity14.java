package class8;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find the second largest element in an array.
		int[] arr = { 13, 8, 78, 8, 94, 45, 67,  21, 89 };
		int temp;
		for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       int secondLarg = arr[arr.length-2];  
       System.out.println("Second Largest: "+ secondLarg);
}  
		
	}


