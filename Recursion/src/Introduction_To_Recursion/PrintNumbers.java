package Introduction_To_Recursion;

public class PrintNumbers {

	public static void printnumber_to_n(int n) {
		// TODO Auto-generated method stub

		if(n==0)
		{
			//System.out.print(n+"");
		return;	
		}
		printnumber_to_n(n-1);
		System.out.print(n);
		
	}
	public static void main(String args[])
	{
	printnumber_to_n(5);
	}

}
