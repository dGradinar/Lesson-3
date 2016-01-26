
package PreIntermediateLevel;
import java.util.Scanner;
public class thirteen {

	public static void main(String[] args) {
		
		//Input:
				Scanner input = new Scanner(System.in);		
				Double a, b, c, d;
				System.out.println("Enter a ->");
				a = input.nextDouble();
				System.out.println("Enter b ->");
				b = input.nextDouble();
				System.out.println("Enter c ->");
				c = input.nextDouble();		
				boolean al = !(b>b.intValue()) && (b.intValue()%2 == 0); 
				if(al){
					b/=2;
					d = b*b - a*c;
				}else{
					a*=2;
					d = b*b - 2*a*c;			
				}		
				System.out.println((al?"Reduced. d":"D")+"iskr. = " + d);
				if(d<0){
					System.out.println("There are no decisions");
					return;
				}				
				if(d == 0)
					System.out.println("Y = " + (-b/a) );
				else{
					d = Math.sqrt(d);
					System.out.println("Y = " + (-b+d)/a + "\tor");
					System.out.println("Y = " + (-b-d)/a);
				}
			}
		 
		}
	
