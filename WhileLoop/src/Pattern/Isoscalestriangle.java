package Pattern;
import java.util.*;
public class Isoscalestriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i =1;
		while(i<=n)
		{
			int space =1;
		while(space<= n-i)
		{
			System.out.print(" ");
			space++;
		}
		int j =1;
		int p =1;
		while(j<=i)
		{
			System.out.print(p);
			j++;
			p++;
		}
		j=1;
		p=i-1;
		while(j<=i-1)
		{
			System.out.print(p);
			j++;
			p--;
		}
		i++;
		System.out.println();
			
		}
		

	}

}
