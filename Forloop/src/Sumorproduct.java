import java.util.*;
public class Sumorproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner sc = new Scanner (System.in);
int n= sc.nextInt();

int c = sc.nextInt();

if(c==1)
{
	int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
        
        
    }
    System.out.println(sum);
    
    
}
else if(c==2)
{
	int mul=1;
    for(int i=1;i<=n;i++)
    {
        mul=mul*i;
        
    }
    System.out.println(mul);
    
}
if(c>2|| c<=0)
{
	System.out.println(-1);
	
}


}
}
