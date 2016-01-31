package PreIntermediateLevel;

public class twelve {

	public static void main(String[] args) {
		int number = 234109;
		int sum = 0;
		for (int i = 0; i < 100; i++) {
		    sum += number % 10;
		    number /= 10;
		    }
		System.out.println("Sum: " + sum);

	}

}
