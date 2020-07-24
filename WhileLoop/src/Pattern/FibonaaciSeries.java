package Pattern;
import java.util.*;
public class FibonaaciSeries {

	public static void main(String[] args) {
		int a =0,b=1;
		int i =0;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(i<n)
		{
			System.out.println(a);
			sum =a +b;
			a=b;
			b=sum;
			
		i++;	
		
		//System.out.println(a);
		}
		
	}

}
