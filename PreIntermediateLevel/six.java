package PreIntermediateLevel;

public class six {

	public static void main(String[] args) {
		int myArray[] = {3,5,7,12};
	    int sum=0;
	    double avarage = 0;
	    if (myArray.length > 0 )
	    for(int i=0; i<myArray.length; i++) {
	        sum+=myArray[i];
	        avarage = sum / myArray.length;
	    }
	    System.out.println(sum);
	    System.out.println(avarage);
	 
	       

	}

}
