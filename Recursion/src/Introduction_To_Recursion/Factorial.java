package Introduction_To_Recursion;

public class Factorial {
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		//int ans=fact(n-1);
		int fact=(n)*fact(n-1);
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
System.out.println(fact(n));
		
	}

}
