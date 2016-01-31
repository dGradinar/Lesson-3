package IntermediateMiddleLevel;
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		String x;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter number: ");
        if(a.hasNextInt()){
              x=a.nextLine();
              int sum=0;
              for(int i=0;i<x.length();i++){
              char m=x.charAt(i);
                
              sum=Character.getNumericValue(x.charAt(i))+sum;
            }
            System.out.println("The sum "+sum);  
        }
        else System.out.println("!!!Error!!! This is not a number!");
        
        
    }
 }
