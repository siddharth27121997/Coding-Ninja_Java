import java.util.*;
public class Primenumber {

	public static boolean isprime(int n)
	{
		int d=2;
		while(d<n)
		{
			if(n%d==0)
			{
				return false;
				
			}
			d++;
		}
		return true;
	}	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	 int n= sc.nextInt();
	 
	System.out.println(isprime(n));
	
	
	}
		
		
	}
		
	