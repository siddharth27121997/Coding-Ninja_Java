import java.lang.*;
import java.util.*;
class Primenumber {
public static boolean check_prime(int n)
{
	int d =2;
	while(d<Math.sqrt(n))
	{
		
		if(n%d==0 )
		{
			return false;
			
		}
			d++;
	}
	
	
	return true;
	
}

public static void prime_series(int p,int q)
{
	
	
	for(int i=p;i<=q;i++)
	{
		boolean series=check_prime(i) ;
		if(series)
		{
			
			
		
				//int rem=i%10; condition for prime number ending with 1
				//if(rem==1)
				{
					
				
		
		
		
				System.out.println(i);
	}
		}
	}
}








public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	int p=sc.nextInt();
	//int n= sc.nextInt();
	int q=sc.nextInt();
	//System.out.println( check_prime(n));
	if(p>q||p<0)
	{
		System.out.println("Invalid Input");
	}
	else
	{
		
	
prime_series(p,q);
}
}
	
	
}