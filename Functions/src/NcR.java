import java.util.*;
public class NcR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	int i =1;
		int num=1;
		int n= sc.nextInt();
		int r=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			num= num*i;
			
		}

		
		int rem=1;
		
		for(int i=1;i<=r;i++)
		{
			rem=rem*i;
			
			
		}
		int ro=1;
		for(int i=1;i<=n-r;i++)
		{
			ro*=i;
			
		}
      
		int ans = num/(rem*ro)
;
				System.out.println(ans);
		
	}

}
