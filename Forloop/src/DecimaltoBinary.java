import java.util.*;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n= sc.nextInt();
int rem= 0,pv=1;
int ans=0;
while(n>0)
{
	rem= n%2;
	ans=ans+(rem*pv);
	pv=pv*10;
	n=n/2;
}
System.out.println(ans);
	
}
	
}
