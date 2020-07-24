import java.util.*;
public class Countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i =0;
		int ori=n;
		int rem=0;
		int rem1=0;
		int  sum=0;
		while(ori>0)
		{
			rem = ori%10;
			i++;
			ori=ori/10;
			
		}
		int digit = (int)Math.log10(n)+1;
			
		int ori1=n;
		while(ori1>0)
		{
		 rem1=ori1%10;
			  sum =sum+(int)Math.pow(rem1,digit);
			ori1=ori1/10;
		}
		System.out.println(sum);
		if(sum==n)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		}

		
	}


