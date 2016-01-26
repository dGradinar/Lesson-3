package AdvancedLevel;
import java.util.Scanner;
public class HappyTestManager {
	
	  static Scanner FTC = new Scanner(System.in);
	  static Scanner cNUI = new Scanner(System.in);
	public static double fTC = FTC.nextDouble();
	public static double pTC;
	public static double CNUI = cNUI.nextDouble();
	public double totalScore = 100;
    public static float Percentage;
    public static float Percentage1;
	
    {
    	Percentage = (float) ((fTC*100) / totalScore);
    	Percentage1 = (float) ((CNUI*100) / totalScore);
    }
    
public static void main(String[] args) {
	
	    Scanner BHP = new Scanner(System.in);
		Scanner BBC = new Scanner(System.in);
		System.out.print("Enter the number of unresolved issues (bugs) with HIGH priority: ");
		int a = BHP.nextInt();
		System.out.print("Enter the number of unresolved issues (bugs) with Blocker and Critical severity: ");
		int b = BBC.nextInt();
		
	    if (a > 10 || b > 5 || fTC > 20 || CNUI > 5)
	    {
		  System.out.print("Build result- Not stable. Percentage fTC = "+ Percentage + "% "+ "è % CNUI= "+ Percentage1 );	
	    }
	    if (a < 10 || b < 5 || fTC < 20 || CNUI < 5)
	    {
	    	
	    	 System.out.print("Build result- Stable. Percentage fTC = "+ Percentage + "% "+ "è % CNUI= "+ Percentage1);	
	    }
	    
  }
		
}
