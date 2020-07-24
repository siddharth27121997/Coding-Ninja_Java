import java.util.*;
public class primenumberbetweenmtoq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int q= sc.nextInt();
		int temp=q;
		for(int i =m;i<=q;i++)
		{
			 boolean b=false;
			int d=2;
			while(d<i)
			{
				if(i%d==0)
				{
	              b= true;	
					break;
					
				}
			   d++;	
				
			}
			
			if(i==1)
			{
				b=true;
				
			}
			if(b==false)
			{
	       // int rem = i%10;			
	      // if(rem==1)
	       //{
					
				
				System.out.println(i);
			}
	       
	       
	    	   
	       }
		// below is the code for prime number that prints the no. if last digit is not prime
		boolean k=false;
		int x=2;
		if(q%x==0)
		{
		k=true;
		}
		x++;
		if(k==true)
		{
	
	
		
		
		
		
			for(int i=q;;i++)
				
			{
				boolean b = false;
				int d=2;
				while(d<i)
				{
					if(i%d==0)
					{
						b=true;
						break;
					}
					d++;
				}
				if(!b)
				{ 
					
						
					
					System.out.println(i);
					break;
				}
				}
			
	   
		}
		}
		
		
		
	

}
