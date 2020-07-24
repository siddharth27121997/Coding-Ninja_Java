package Pattern;
import java.util.*;
public class starpatternixwithnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i =1;
while(i<=n)
{
	int j =1;
	while(j<=n-i)
	{
		System.out.print("*");
		j++;
	}
	j =1;
	while(j<=i)
	{
		System.out.print(j);
		j++;
	}
	System.out.println(" ");
	i++;
}
	
	}

}
