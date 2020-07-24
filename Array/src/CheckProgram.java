import java.util.*;
public class CheckProgram {
	
	
	public static int[] inputarray()
	{
		Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
for(int i =0;i<arr.length;i++)
{
	arr[i]= sc.nextInt();
}
		return arr;
		
		
	}
	
	
	public static void printarray(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}

	public static void increment(int i)
	{
		i++;
		System.out.println(i);
		
	}
	public static void incrementarray(int arr[])
	{
		//arr= new int[5];
		//arr=new int[6];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]++;
			
		//System.out.print(arr[i]+" ");
		}
		//System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr1[]= new int[5];
int arr1[]=inputarray();
System.out.println(arr1);
printarray(arr1);
//int arr2= new int[5];
//int arr2[]= {3,4,5,6,7};
		incrementarray(arr1);
		printarray(arr1);
		int i =10;
//increment(i);
		
		System.out.println(i);
		
		
		increment(i);
		
	}

}
