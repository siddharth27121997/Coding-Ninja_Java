//import java.util.*;
public class Fact
{
	public static int fact(int n)
	{ 
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
		
	}
	

public static void main(String args[])
{
int n =5;
int r=3;
int k=fact(n);	
int y=fact(r);
int z= fact(n-r);
	System.out.println(k/(y*z));
}
}