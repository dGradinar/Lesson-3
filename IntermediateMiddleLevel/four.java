package IntermediateMiddleLevel;

public class four {

	public static void main(String[] args) {
		
		String str = "ab23c24xd2d34d3";
		str=str.replaceAll("[\\D]+"," ");
		String[] numbers=str.split(" ");
		int sum = 0;
		for(int i=0;i<numbers.length;i++){
		    try{
		        sum+=Integer.parseInt(numbers[i]);
		    }
		    catch( Exception e ) {
		     
		    }
		}
		System.out.println(sum);

		
		}
	}


