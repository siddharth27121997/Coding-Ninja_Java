import java.util.*;
public class Fact {
public static long fact(long n)
{
	long a = 1;
	long i=1;
	while(i<=n)
	{
		a=a*i;
		i++;
		
	}
	return a ;
	
}	

public static boolean isprime(int m)
{
	//int p=1;
	int q =2;
	while(q<m)
	{
		if(m%q==0)
		{
			return false;
		}
		q++;
	}
	return true;
	
} 
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
long num = fact(n);
float e=12.55f;
long jira= fact(n);
long ff= (long) Math.pow(num,jira);
boolean b=isprime(k);
System.out.println(b);
//System.out.println(ff);


}

}
