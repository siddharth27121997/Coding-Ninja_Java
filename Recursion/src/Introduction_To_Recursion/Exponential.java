package Introduction_To_Recursion;



public class Exponential {

	public static int power(int x,int n)
	{
		if(n==1)
		{
			return x;
		}
		return (x*power(x,n-1));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=power(5,5);
		System.out.println(a);
	}

}
