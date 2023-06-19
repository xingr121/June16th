package class8;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find common elements between two arrays (string values)
		
		String[] array1 = { "apple", "stawberry", "banana", "orange", "kiwi" };
        String[] array2 = { "orange", "kiwi", "blueberry", "grapefruit", "melon" };
        
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    System.out.println(array1[i]);
                }
            }
        }
 
	}

}
