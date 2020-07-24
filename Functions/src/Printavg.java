import java.util.*;
public class Printavg {

	
	public static void avg(int a,int b)
	{
		double c = (double)(a+b)/2;
		
		System.out.println(c);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//double k = avg(a,b);
		avg(a,b);

	
	
	
	}

}
