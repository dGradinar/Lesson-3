package AdvancedLevel;

public class PG1 {
	public class Password {
	    private final String str = "abcdefg";
	    private final int size;
	    private int mySize;
	   
	    public Password (){
	        size = generateSize();
	        System.out.println("Пароль успешно сгененрирован");
	        System.out.println(generatePass());
	       
	    }
	   
	    private int generateSize(){
	        mySize = (int)(Math.random()*20);
	        if((mySize<8)|(mySize>12)){
	            generateSize();
	        }
	        return mySize-3;
	    }
	   
	    private char[] generateChar(){
	        int b;
	        char[] pass = new char[size];
	        for (int i=0; i<pass.length; i++){
	            do{
	                b=(int)(Math.random()*10);
	                pass[i]=str.charAt(b);
	            }while( b>10 );
	        }
	       
	        do {
	                b=(int)(Math.random()*10);
	                if(b<pass.length) pass[b] = Character.toUpperCase(pass[b]);
	            } while( b>pass.length-1);
	        return pass;
	    }
	   
	    private int generateInt(){
	        int chislo;
	         do{
	             chislo = (int)(Math.random()*1000);
	         }while(100>chislo);
	         return chislo;
	    }
	   
	    private String generatePass(){
	        String str1 = null;
	        char[] pass = generateChar();
	        for(int i=0; i<pass.length; i++){
	            if(i==0){
	                str1 = Character.toString(pass[i]);
	            }else{
	                str1 += Character.toString(pass[i]);
	            }
	        }
	        str1 += Integer.toString(generateInt());
	        return str1;
	    }
	}

}
