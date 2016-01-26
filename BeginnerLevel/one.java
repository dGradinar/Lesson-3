package Beginnerlevel;

public class one {

	public static void main(String[] args) {
		int[] Numbers;
		
		Numbers = new int[10];
	
		int i;
		
		for(i = 0; i < 10; i++)
			  Numbers[i] = i * 3;
		
		System.out.print("Numbers: [" 
				  + Numbers[0]); 
				    
				for(i = 1; i < Numbers.length; i++)
				  System.out.print("," + Numbers[i]); 
				      
				System.out.println("]");
	}

}
