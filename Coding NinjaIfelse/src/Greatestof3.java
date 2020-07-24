import java.util.Scanner;
public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		if(a>=b && a>= c  )
		{
			System.out.println(a);
		}
		else
		{
			if(b>=c && b>=a)
			{
				System.out.println(b);
			}
			
			else
			{
				System.out.println(c);
			}
		}
			

	}

}
