
public class Trailing_zero {

	public static int trailing_zero(int n)
	{
		int sum=0;
		for(int i=5;n/i>=1;i*=5)
		{
			sum+=n/i;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(trailing_zero(10));
	}

}
