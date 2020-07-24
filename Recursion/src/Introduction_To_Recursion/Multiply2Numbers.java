package Introduction_To_Recursion;

public class Multiply2Numbers {

	
	
	public static int mul (int m,int n)
	{
		if(m==0)
		{
			return 0;
		}
		
		else
		{
			int a=mul(m-1,n);
			return a+n;
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
        int n=2;
		System.out.println(mul(m,n));

	}

}
