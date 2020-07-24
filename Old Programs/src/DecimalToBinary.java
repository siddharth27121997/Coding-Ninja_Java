import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int rem =0,ans=0,pv=1;
		while(n>0)
		{
			rem = n%2;
			ans= ans+(pv*rem);
			pv = pv*10;
			n=n/2;
			
		
		
		}	
		System.out.println(ans);
	
	}

}
