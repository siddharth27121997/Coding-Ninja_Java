import java.util.*;
public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int i =0,rem=0,sum=0;
		while(n>0)
		{
			rem= n%10;
			double a= Math.pow(2,i);
			sum= sum+(int)(a*rem);
			i++;
			n= n/10;
			
			
		}
		System.out.println(sum);
		
		
		
	}

}
