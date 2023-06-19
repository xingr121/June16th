package class8;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to remove duplicate elements from an array.
		
		int[] arr = { 13, 8, 78, 8, 94, 45, 67, 94, 21, 89 };
		System.out.println("Original Array : ");
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
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
        int[] newarr = new int[count];
        for (int i = 0; i < count; i++) {
        	newarr[i] = arr[i];
        
        }
        System.out.println("array with unique value: ");
         for (int i = 0; i < count; i++) {
        	System.out.print(newarr[i] + " ");
        
        }
     
	}
}
