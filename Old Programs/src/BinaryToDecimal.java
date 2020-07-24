import java.util.*;
public class BinaryToDecimal {
	public static void binarytodicimal(int n)
	{
		int i =0,rem=0,sum=0;
		while(n>0)
		{
			rem = n%10;
			int a =(int) Math.pow(2,i);
			sum=sum+(a*rem);
			n/=10;
			i++;
			
	}
	System.out.println(sum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
binarytodicimal(n);	
	
	
	}
}