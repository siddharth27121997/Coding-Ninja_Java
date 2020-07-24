import java.lang.*;
import java.util.*;
public class Forloopprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
//int n = sc.nextInt();
int m = sc.nextInt();
int p=sc.nextInt();
//boolean div=false;
for(int i=m;i<=p;i++)
{
	
	boolean div=false;
for(int d=2;d<i;d++)
{
	//boolean div=false;
	if(i%d==0)
	{
		div=true;
		break;
	}
	
}
if(i==1)
{
	div=true;
	break;
}
if(!div)
{
	//int rem=i%10;
	//if(rem==1)
			
	
	System.out.println(i);

}

}
}
}