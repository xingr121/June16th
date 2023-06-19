package class8;

public class Activity27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the length of the longest consecutive 
//		elements sequence from an unsorted array of integers
		int[] arr = { 10, 8, 78, 7, 94, 45, 67,  9, 89 };
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
		int counter = 1;
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] == arr[i - 1] + 1) {
                counter++;
            } 
	}
		System.out.println("The length of the longest consecutive sequence is: " + counter);

}
}
