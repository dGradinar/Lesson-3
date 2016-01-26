package AdvancedLevel;
import java.text.DecimalFormat;

public class YC {
	private static final String[] tensNames = {
		    "",
		    " zece",
		    " douăzeci",
		    " treizeci",
		    " patruzeci",
		    " cincizeci",
		    " șaizeci",
		    " șaptezeci",
		    " optzeci",
		    " nouăzeci"
		  };

		  private static final String[] numNames = {
		    "",
		    " unu",
		    " doi",
		    " trei",
		    " patru",
		    " cinci",
		    " șase",
		    " șapte",
		    " opt",
		    " nouă",
		    " zece",
		    " unsprezece",
		    " doisprezece",
		    " treisprezece",
		    " paisprezece",
		    " cincisprezece",
		    " șaisprezece",
		    " șaptesprezece",
		    " optsprezece",
		    " nouăsprezece"
		  };

		  private YC() {}

		  private static String convertLessThanOneThousand(int number) {
		    String soFar;

		    if (number % 100 < 20){
		      soFar = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      soFar = numNames[number % 10];
		      number /= 10;

		      soFar = tensNames[number % 10] + soFar;
		      number /= 10;
		    }
		    if (number == 0) return soFar;
		    return numNames[number] + " o mie" + soFar;
		  }


		  public static String convert(long number) {
		    if (number == 0) { return "zero"; }

		    String snumber = Long.toString(number);

		    String mask = "000000000000";
		    DecimalFormat df = new DecimalFormat(mask);
		    snumber = df.format(number);

		  
		    int billions = Integer.parseInt(snumber.substring(0,3));
		    int millions  = Integer.parseInt(snumber.substring(3,6));
		    int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		    int thousands = Integer.parseInt(snumber.substring(9,12));

		    String tradBillions;
		    switch (billions) {
		    case 0:
		      tradBillions = "";
		      break;
		    case 1 :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " un miliard ";
		      break;
		    default :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " un miliard ";
		    }
		    String result =  tradBillions;

		    String tradMillions;
		    switch (millions) {
		    case 0:
		      tradMillions = "";
		      break;
		    case 1 :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " un milion ";
		      break;
		    default :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " un milion ";
		    }
		    result =  result + tradMillions;

		    String tradHundredThousands;
		    switch (hundredThousands) {
		    case 0:
		      tradHundredThousands = "";
		      break;
		    case 1 :
		      tradHundredThousands = "o mie ";
		      break;
		    default :
		      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
		         + " mii ";
		    }
		    result =  result + tradHundredThousands;

		    String tradThousand;
		    tradThousand = convertLessThanOneThousand(thousands);
		    result =  result + tradThousand;

		    // remove extra spaces!
		    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
		  }

		  public static void main(String[] args) {
		    System.out.println("Year- " + YC.convert(1550));
		    System.out.println("Year- " + YC.convert(1648));
		    System.out.println("Year- " + YC.convert(1745));
		    System.out.println("Year- " + YC.convert(1882));
		    System.out.println("Year- " + YC.convert(1923));
		    System.out.println("Year- " + YC.convert(1995));
		    System.out.println("Year- " + YC.convert(1985));
		    System.out.println("Year- " + YC.convert(2010));
		    System.out.println("Year- " + YC.convert(2016));
		    System.out.println("Year- " + YC.convert(1));
		    System.out.println("Year- " + YC.convert(2));
		    System.out.println("Year- " + YC.convert(3));
		    System.out.println("Year- " + YC.convert(154));
		    System.out.println("Year- " + YC.convert(235));
		    System.out.println("Year- " + YC.convert(355));
		    System.out.println("Year- " + YC.convert(2015));
		    

		    
		  }

}
