package Introduction_To_Recursion;

public class Mutiply_2_Number {
	
	public static int multiply_no(int m,int n)
	{
		if(n==0)
		{
			return 0 ;
		}
		return m+multiply_no(m,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=4;
		int n=3;
		System.out.println(multiply_no(m,n));
	}

}
