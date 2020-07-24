
public class Fibonacci_Fibo_series {

	
	
public static int fib(int n)
{
	int a=0;
	int b=1;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		//arr[i]=a;
		sum=a+b;
		a=b;
		b=sum;
		
	}
	return a;
}

	
	public static int[] fibo(int n)
	{
		int arr[]= new int[n];
		//int i=0;
		int a=0;
		
		
		int b=1;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=a;
			sum=a+b;
			a=b;
			b=sum;
			
		}
		//String s=Integer.toString(a);
		return arr;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int a=fib(n);
System.out.println(a);
int k[]=fibo(n);
		
		for(int i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" ");
		}
		System.out.println();
	}

}
