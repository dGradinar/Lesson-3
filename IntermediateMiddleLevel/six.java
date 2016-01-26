package IntermediateMiddleLevel;
import java.util.*;
public class six {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Please enter text: ");
	        String str = scan.nextLine();
	        
	        String[] mas_str = str.split("[\\s,.!?]+");
	        
	        String max = mas_str[0];
	        
	        for(int i = 1; i < mas_str.length; ++i){
	            if(max.length() < mas_str[i].length())
	                max = mas_str[i];
	        }
	            
	        System.out.println(max);
}

	}
	


