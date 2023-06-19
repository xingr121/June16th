package class8;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find duplicate values in an array of string values
		
		String[] names = {"john", "java", "ruby", "leo", "tara", "java", "andy"};
		System.out.println("the array: ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++)
            {
                if (names[i].equalsIgnoreCase( names[j]))
                {
                    System.out.println("Duplicate value : "+ names[j] );
                }
            }
        }
	}

}
