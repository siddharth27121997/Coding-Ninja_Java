package Pattern;
import java.util.*;
public class sumnnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
		long a=1L,s=0;
		while(a<=n)
		{
			s=s+a;
		a++;
		}
		System.out.println(s);
		
	}

}
