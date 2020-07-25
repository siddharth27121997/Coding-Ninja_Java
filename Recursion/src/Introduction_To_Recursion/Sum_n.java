package Introduction_To_Recursion;

public class Sum_n {
	public static int count=1;
	public static int count_(int n)
	{
		if(n<=1)
		{
			return 0;
		}
		int a= count_(n/10);
		count++;
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1246466;
System.out.println(count_(n));		

	}

}
