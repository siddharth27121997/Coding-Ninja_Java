package Introduction_To_Recursion;

public class Multiply {

	public static int mul(int m ,int n)
	{
		if( n==0)
		{
			return 0;
		}
		return(m)+mul(m,n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=5;int n=3;
System.out.println(mul(m,n));
	}

}
