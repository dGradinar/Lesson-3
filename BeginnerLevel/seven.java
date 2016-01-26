package Beginnerlevel;

public class seven {

	public static void main(String[] args) {
		int [] array = {12,1,5,7,13,123,22,4142,23};
        int max = 0;
        for(int i = 0; i<array.length; i++){
            if(max<array[i])
                max = array[i];
        }
        System.out.println("Max: "+max);
    }
				

	}
