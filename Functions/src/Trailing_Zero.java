
public class Trailing_Zero {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static int trailing_zero(int n)
	{
		int count=0;
		for(int i=5;n/i>=1;i=i*5)
		{
			count+=n/i;
		}
		return count;
	}
	
	

	public static void main(String args[])
	{
		int n=100;
		System.out.println(trailing_zero(n));
	}
}


