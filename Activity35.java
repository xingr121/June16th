package class8;

public class Activity35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to sort an array of positive integers from an array. In 
//		the sorted array the value of the first element should be maximum, the second 
//		value should be a minimum, third should be the second maximum, the fourth 
//		should be the second minimum and so on.
		 int[] arr = { 13, 8, 78, 94, 45, 67,  21, 89 };
		 int temp;
		 int n = arr.length;
		 
		 System.out.println("original array: ");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		 
		
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
		
		int[] temparr = new int[n];
	     
        int small_num = 0, large_num = n-1;
        boolean flag = true;
    
       for (int i=0; i < n; i++)
       {
           if (flag)
               temparr[i] = arr[large_num--];
           else
               temparr[i] = arr[small_num++];
    
           flag = !flag;
       }
       
       System.out.println("new array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(temparr[i] + " ");
		}
		System.out.println();
	}

}
