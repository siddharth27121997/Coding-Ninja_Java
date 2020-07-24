import java.util.*;
public class Lastdigitoneprimenumber {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		int m = sc.nextInt();
		int q=sc.nextInt();
		for(int i=m;i<q;i++)
		{
			boolean div = false;
			for(int d=2;d<i;d++)
			{
				if(i%d==0)
				{
					div=true;
				  break;
					
				}
				
			}
			
			if(i==1)
			{
				div= true;
				
			}
			if(!div)
			{
				int rem =i%10;
				if(rem==1)
				{
					System.out.println(i);
				}
			}
			
		}
		
		
		
		
		
		

	}

}
