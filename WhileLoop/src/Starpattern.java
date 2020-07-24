import java.util.*;
public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			//System.out.print("*");
			while(j<=n)
			{
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}	
			
	}
}
