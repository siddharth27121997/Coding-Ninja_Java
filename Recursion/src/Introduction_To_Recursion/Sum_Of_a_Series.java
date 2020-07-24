package Introduction_To_Recursion;

public class Sum_Of_a_Series {

	
	public static int sum(int n)
	{
	if(n==1)
	{
		return 1;
	}
	else
	{
		int a =sum(n-1)+n;
		return a;
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(5));
		
	}

}
