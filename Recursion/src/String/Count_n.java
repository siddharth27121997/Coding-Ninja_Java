package String;

public class Count_n {

	public static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int a= count(n/10);
		return a+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1234;
		System.out.println(count(n));
	}

}
