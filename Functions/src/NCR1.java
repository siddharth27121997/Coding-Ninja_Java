import java.util.*;



public class NCR1 {

	public static int factorial (int n)
	{
		int ans=1;
		int i=1;
		while( i<=n)
		{
			ans=ans*i;
			i++;
		}
		return ans;
		
	}
	
	public static int NCR(int N,int R)
	{
	 int Numerator=factorial(N);
	 int dem1=factorial(R);
		int dem2=factorial(N-R);
	int result = Numerator/(dem1*dem2);
	return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int N = sc.nextInt();
	int R=sc.nextInt();
	int total= NCR(N,R);
	System.out.println(total);
	}
}