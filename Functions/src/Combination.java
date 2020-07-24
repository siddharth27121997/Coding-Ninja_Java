import java.util.*;

public class Combination {
//int answer=1;
	

public static int factorial(int n)
{
	int ans=1;
	for(int i =1;i<=n;i++)
	{
		ans=ans*i;
		
	}
	return ans;
	
}

public static void main(String args[])

{
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	int r =s.nextInt();
	
	int num = factorial(n);
    int dem1= factorial(r);	
	int dem2= factorial(n-r);
   int ans= num/(dem1*dem2);
System.out.println(ans);

}



}
