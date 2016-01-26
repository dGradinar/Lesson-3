package IntermediateMiddleLevel;
import java.util.Arrays;

public class three {

	public static void main(String[] args) {
       
		        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		        for (int i = 0; arr.length/2 > i; i++) {
		            int tmp = arr[i];
		            arr[i] = arr[arr.length - i - 1];
		            arr[arr.length - i - 1] = tmp;
		        }
		        System.out.println(Arrays.toString(arr));

	}

}

