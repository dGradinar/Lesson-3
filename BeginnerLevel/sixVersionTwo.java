package Beginnerlevel;

public class sixVersionTwo {

	public static void main(String[] args) {
		int[] iNumbers;
		iNumbers = new int[50];
		int i;
		for(i = 0; i < 50; i++)
			  iNumbers[i] = i;
		System.out.print("iNumbers: [" 
				  + iNumbers[0]); 
				    
				for(i = 0; i < iNumbers.length; i++)
				  System.out.print(","  + iNumbers[i++] ); 
				      
				System.out.println("]");
		
	}
	}


