package Introduction_To_Recursion;

public class Fibo {

	
	public static int fib(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=11;
		System.out.println(fib(n));
		for(int i =0;i<k;i++)
		{
			System.out.print(fib(i)+" ");
		}
		System.out.println();

	}

}
