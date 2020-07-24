
package Other;
import java.util.*;
public class Numberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		//int orignalnum=n;
		int d= sc.nextInt();
		//int i=1;
		int c=0;
		while(n>0)
		{
			if(n%10==d)
			{
				
			
		c++;
			}
			n/=10;
			
		}
		System.out.println(c);
			
		
		
		}
	}


