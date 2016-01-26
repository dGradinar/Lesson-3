package PreIntermediateLevel;

public class one {

	public static void main(String[] args) {
		boolean heSmile = true;
		boolean sheSmile = true;
		boolean s;
		s = (heSmile && sheSmile) == true; 
		s = (!heSmile || !sheSmile)== false;
		s = (heSmile || !sheSmile)== false;
		s = (!heSmile || sheSmile)== true;
		boolean g;
		g = s == false;
		System.out.println("Не идем в кино  " + g);
		g = s == true;
		System.out.println("Идем в кино  " + g);
	}

}
