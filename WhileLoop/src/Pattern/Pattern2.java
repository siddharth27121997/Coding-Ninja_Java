
package Pattern;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(n-j+1);
				j++;
				
			}
			
			i++;
			System.out.println("");
		}
		

	}

}
