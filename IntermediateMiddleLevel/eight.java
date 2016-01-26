package IntermediateMiddleLevel;
import java.util.regex.*;
public class eight {

	public static void main(String[] args){
		String s = "checkChangingProfilePicture";
	    StringBuilder look = new StringBuilder(s);
	    Pattern p = Pattern.compile("[A-Z]");
	    Matcher m = p.matcher(s);
	    int y = 0;
	    while(m.find()){
	        if(m.start()!=0){
	            look = look.insert(m.start()+y, " ");
	            y++;
	        }
	    }
	    System.out.println(look);

	      

}
}

	
