package Introduction_To_Recursion;

public class Sumof_number {

	public static int sum(int n)
	{
		int sum1=0;
		if(n==0)
		{
			return 0;
		}
		sum1=sum1+(n%10);
		return sum1+sum(n/10);
		
	}
	
	public static int power(int x,int pow)
	{
		if(pow==1)
		{
			return x;
		}
		else
		{
			return(x*power(x,pow-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
		System.out.println(sum(n));
	System.out.println(power(5,2));
	}

}
