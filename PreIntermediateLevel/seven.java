package PreIntermediateLevel;

public class seven {

	public static void main(String[] args) {
		int [] num = {12, 3, 123, 2456, 43};
        int max = num[0];
        int min = num[0];
        int resultmin = 0;
        int resultmax = 0;
        for(int i = 0; i != num.length; i ++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
            {
              resultmin = min * 2;
              resultmax = max * 2;
            }
        }
        System.out.println(min + " " + max);
        System.out.println(resultmin);
        System.out.println(resultmax);

	}

}
