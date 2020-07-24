package Pattern;
import java.util.*;
public class Charecterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//char ch = sc.nextLine().charAt(0);
		int i=1;
		while(i<=n)
		{
			int j=1;
			//char ch = 'A';
			while(j<=n)
			{
				System.out.print((char)('A'+j-1));
			j++;	
			}
			
			
			System.out.println("");
			i++;
		}
		
		
	}

}
