package Introduction_To_Recursion;

public class Sum_2Numbers {

	public static int sum_of(int n)
	{
		
		
		
		return sum_of(n,0);
		
	}
	
public static int sum_of(int n,int sum)
{
	if(n==0)
	{
	  return 0;
	}
	
	else
	{
		sum+=n%10;
		return sum_of(n/10)+sum;
	}
	
}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10220;
		System.out.println(sum_of(n));
	}

}
