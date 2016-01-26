package AdvancedLevel;
import java.util.Scanner;
public class HTM {

	public static void main(String[] args) {
		
		
		double totalScore = 100;
	    float Percentage;
	    float Percentage1;

	    
	    Scanner cNUI = new Scanner(System.in);
	    Scanner FTC = new Scanner(System.in);
	    System.out.print("Enter the failed number of test cases (TC): ");
		double fTC = FTC.nextDouble();
		System.out.print("Enter the complete number of unresolved issues: ");
		double CNUI = cNUI.nextDouble();
	    {
	    	Percentage = (float) ((fTC*100) / totalScore);
	    	Percentage1 = (float) ((CNUI*100) / totalScore);
	    }
	    if (fTC > 20 || CNUI > 5){
	    	
	    	  System.out.print("Данная сборка не стабильна, так как % fTC = "+ Percentage + "% "+ "и % CNUI= "+ Percentage1 + "%" );	
	    }
	    
  }
	    }

	
