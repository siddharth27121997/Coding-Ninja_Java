import java.util.*;
public class ArrayIntiliaztion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner c = new Scanner(System.in);
int n = c.nextInt();
int arr[]= new int[n];

for(int i=0;i<n;i++)
{
	arr[i]= c.nextInt();
	
}
		
for(int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
	
}
		
System.out.println();
	}

}
