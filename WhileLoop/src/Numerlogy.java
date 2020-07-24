import java.lang.*;
import java.util.*;
public class Numerlogy {

	public static int numerlogy(int n)
	{
		int sum=0;
		int rem=0;
		int orignal_num=n;
		while(orignal_num>0||sum>9)
		{
			//int rem=n%10;
			if(orignal_num==0)
			{
				orignal_num=sum;
				sum=0;
				
			}
			 rem=orignal_num%10;
			
		      sum=sum+rem;	
		      orignal_num/=10;
			
			
		}
		return sum;
		
		
	}
	
	public static void xo(int n)
	{
		int rem=0;
		int count=0;
		int count1=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				count++;
			}
			else if(rem%2!=0)
			{
				count1++;
			}
			n/=10;
		}
		System.out.println(count);
		System.out.println(count1);
	}
	public static void hpp(int n)
	{
		//Scanner sc= new Scanner(System.in);
		/*
		 * int count=(int)Math.log10(n)+1; int arr[]= new int[count]; for(int
		 * i=0;i<arr.length;i++) { arr[i]= n%10; n/=10;
		 * 
		 * }
		 */
    
		String str= Integer.toString(n);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
	}
	public static int j(int n)
	{
		int i=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			i++;
		n/=10;
		}
		return i;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int k=numerlogy(1234);
	
	System.out.println(k);
	xo(1234);
	hpp(1234);
	/*
	 * for(int i=0;i<a.length;i++) { System.out.print(a[i]+" "); }
	 * System.out.println(); //int u=1;
	 *///int g=0;
	//while(u!=0)
	
	/*
	 * int g=%10;
	 * 
	 * 
	 * 
	 //*///System.out.println(g);
//	int nn=j(1234);
int hj=j(1234);
System.out.println(hj);
}
}
