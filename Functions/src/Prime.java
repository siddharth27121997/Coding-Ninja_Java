import java.util.*;
public class Prime {

	
	public static void prime_no(int n)
	{
		int d=2;
		boolean div= false;
		while(d<n)
		{
		if(n%d==0)
		{
			div=true;
		    break;	
		}
		d++;
		}
		if(n==1 || n==0)
		{
			div=true;
		}
		if(div==false)
		{
			int rem=n%10;
			if(rem==1)
			{
	    	System.out.println(n);	
			}
			
		}
	
		
	}
			
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
	int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			prime_no(i);
			
		
		}
		
		boolean div=false;
		int d=2;
		while(d<n)
		{
		if(n%d==0)
		{
			div=true;
		    break;	
		}
		d++;
		}
		if(div==true)
		{
			for(int i=n;;i++)
			{
				boolean sip=false;
				int p=2;
				while(p<i)
				{
					if(i%p==0)
					{
						sip=true;
					break;
					}
					p++;
				}
				if(sip==false)
				{
					int rem=i%10;
					if(rem==1)
					{
						System.out.println(i);
					break;
					}
				}
			}
		}
	
	
		
	
		
	
	
	}

}
