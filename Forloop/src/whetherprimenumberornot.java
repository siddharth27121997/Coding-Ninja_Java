import java.util.*;
public class whetherprimenumberornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int d=2;
		boolean div = false;
		while(d<n)
		{
			if(n%d==0)
			{
				div=true;
				System.out.println("not true");
			
				break;
				
			}
			d++;
		}
			if(n==1)
			{
				div=true;
				System.out.println("Not true");
			}
			
		
		if(!div)
		{
		System.out.println("True");
		}
	}

}
