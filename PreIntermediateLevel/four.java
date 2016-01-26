package PreIntermediateLevel;

public class four {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	       System.out.print('{');
	       for(int i=arr.length/2;i<arr.length-1;i++)
	       {
	           System.out.print(String.format("%d, ", arr[i]));
	       }
	       System.out.println(String.format("%d}", arr[arr.length-1]));


	}

}
