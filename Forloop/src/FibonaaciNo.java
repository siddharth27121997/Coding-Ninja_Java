import java.util.*;
public class FibonaaciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int a=0,b=1,c=0;
		for( int i =1;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
		
	}

}
