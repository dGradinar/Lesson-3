package PreIntermediateLevel;

public class eight {
	 public static int fib(int n) {
	        if (n <= 2)
	            return 1;
	        else
	            return fib(n - 1) + fib(n - 2);
	    }
	 
	    public static void main(String[] args) {
	        int count = 0;
	        
	        int sum = 0;
	        while (true) {
	            int number = fib(count);
	            if (number > 100)
	                break;
	            if (number % 2 != 0) {
	                sum += number;
	            }
	            count++;
	        }
	        {
	            System.out.println(sum);
	        }
	    }

}
