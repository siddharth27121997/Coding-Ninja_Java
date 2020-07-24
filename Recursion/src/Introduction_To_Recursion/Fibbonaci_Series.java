package Introduction_To_Recursion;

public class Fibbonaci_Series {

	public static long fib(long n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
long k=fib(2);
System.out.println(k);
		for(long i=0;i<5;i++)
		{
			count++;
		System.out.println(fib(i)+" ");
		
		}
		System.out.println(count);
	}
}

