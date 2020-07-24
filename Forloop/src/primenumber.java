import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		boolean division= false;
		//Scanner sc= new Scanner(System.in);
		int d =2;
		while(d<n)
		{
			if(n%d==0)
			{
				 division = true;
			break;
			}
			
			
		
		d=d+1;
		}
		if(!division)
		{
			System.out.println(" prime");
		}
		else
		{
			System.out.println("No it is");
		}
		}
	}
	


