import java.util.*;
public class GCD_of_2number {

	
	public static void gcd_2number(int n1,int n2)
	{
		int gcd=1;
		int a=Integer.min(n1, n2);
		for(int i=2;i<=a;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
			
		}
		System.out.println(gcd);
		int lcm=((n1*n2)/gcd);
		System.out.println(lcm);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=5;
       int n2=6;
		gcd_2number(n1,n2);
//System.out.println(k);
	}

}
