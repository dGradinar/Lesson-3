package Beginnerlevel;

public class ten {

	public static void main(String[] args) {
		
		int[][] a1 = new int[4][];
		
		a1[0] = new int [1];
		a1[1] = new int [2];
		a1[2] = new int [3];
		a1[3] = new int [4];
		for(int i = 0; i<a1.length; i++){
			for(int j = 0; j<a1[i].length; j++){			
			    System.out.print("*");
			}
			System.out.println();
			}
			
		a1[0] = new int [4];
		a1[1] = new int [3];
		a1[2] = new int [2];
		a1[3] = new int [1];
			
			for(int x = 0; x<a1.length; x++){
				for(int j = 0; j<a1[x].length; j++){			
				    System.out.print("*");
				}
				System.out.println();
				
	
}
}
}