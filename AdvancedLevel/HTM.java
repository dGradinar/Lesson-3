package AdvancedLevel;
import java.util.Scanner;
public class HTM extends HappyTestManager{

	public static void main(String[] args) {
		
		
		    Scanner FTC = new Scanner(System.in);
		    Scanner cNUI = new Scanner(System.in);
		    System.out.print("Enter the failed number of test cases (TC): ");
		    double  fTC = FTC.nextDouble();
		    System.out.print("Enter the complete number of unresolved issues: ");
		    double CNUI = cNUI.nextDouble();
		    Scanner BHP = new Scanner(System.in);
			Scanner BBC = new Scanner(System.in);
			System.out.print("Enter the number of unresolved issues (bugs) with HIGH priority: ");
			int a = BHP.nextInt();
			System.out.print("Enter the number of unresolved issues (bugs) with Blocker and Critical severity: ");
			int b = BBC.nextInt();
			
			Percentage = (float) ((fTC*100) / totalScore);
	    	Percentage1 = (float) ((CNUI*100) / totalScore);
	    	
	    	if (a > 10 || b > 5 || fTC > 20 || CNUI > 5)
	    	{
	  		  System.out.print("Build result- Not stable. Percentage fTC = "+ Percentage + "% "+ "and percentage CNUI= "+ Percentage1+"%" );	
	  	    }
	    	 if (a < 10 || b < 5 || fTC < 20 || CNUI < 5)
	 	    {
	 	    	
	 	    	 System.out.print("Build result- Stable. Percentage fTC = "+ Percentage + "% "+ "and percentage CNUI= "+ Percentage1+"%");	
	 	    }
	    	
			
  }
	    }

	
