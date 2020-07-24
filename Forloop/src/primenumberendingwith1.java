import java.util.*;
public class primenumberendingwith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int m= sc.nextInt();
	int n=sc.nextInt();
	for(int i=m;i<n;i++ )
	{
		boolean b = false;
		for(int d= 2;d<i;d++ )
		{
			if(i%d==0)
			{
				b=true;
				break;
			}
			
		}
		if(i==1)
		{
			b = true;
			break;
		}
		if(!b)
		{
			int rem=i%10;
			if(rem==1)
			{
		System.out.println(i);
		}
		}
	}
	
	
	
	
	
	
	
	}

}
