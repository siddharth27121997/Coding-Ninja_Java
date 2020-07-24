package Pattern;
import java.util.*;
public class Charecterpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p= 'E';
int i=1;
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();

while(i<=n)
{
	int j = 1;
	while(j<=i)
	{
		System.out.print((char)(p+j-1));
		j++;
	}
		p--;
		i++;
		System.out.println("");
		
	
}
		
		
	}

}
