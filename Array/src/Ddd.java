import java.util.*;
public class Ddd {
	
	
    	
	public static String reverse(long n)
	{
		String output1="";
		String output= Long.toString(n);
		for(int i=output.length()-1;i>=0;i--)
		{
			output1=output1+output.charAt(i);
		}
		
return output1;
	}
	
	public static void print(int n)
	{
		if(n==0)
		{
	
			System.out.println();
			//System.out.println();
		return;
		}
		System.out.print(n);
	print(n-1);
	
	
	}
	
	public static long reverse2(long n)
	{
		long rev=0;
		long rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		return rev;
		
	}
	public static int fibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int a =fibo(n-1);
		int b=fibo(n-2);
		return a+b;
	}
	static String output="";
	public static String re(int n)
	{
		if(n==0)
		{
			return output;
		}
		else
		{
		output+=n%10+"";
		re(n/10);
		}
		return output;
	}
	
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		long n= sc.nextLong();
		System.out.println(reverse(n));
		
		print(5);
		//System.out.println(reverse1(n));
	System.out.println(reverse2(n));
	for(int i=0;i<8;i++)
	{
	System.out.print(fibo(i)+" ");
	}
   System.out.println();
	System.out.println(re(1010));
	}
}
