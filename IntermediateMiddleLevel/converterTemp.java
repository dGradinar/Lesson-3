package IntermediateMiddleLevel;

public class converterTemp {

	 public int converterTemp(int temperature, char convertTo) {
	        switch (convertTo) {
	        case 'C':
	            temperature = temperature + 273;
	            break;
	        case 'K':
	            temperature = temperature - 273;
	            break;
	        }
	        return temperature;
	    }
}
