import java.util.*;
public class Findunique {
	
	public static int find_unique(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int j;
			for( j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						break;
					}
				}
			}
			
			if(j==arr.length)
			{
				
				return arr[i];
			}
		}
			return Integer.MIN_VALUE;
		
	}		
		//int sum=0;
		
		//for(int i=0;i<arr.length;i++)
		
			
	public static void square(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
		
			int sum=0;
			int j;
			for(j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
		      int a =(int)Math.pow(arr[j], 2);
					sum =sum+a;
				}
			
			}
			System.out.println(sum);
			
			}
		
	}	
		


	public static int[] inputarray()
	{
		Scanner sc =new Scanner(System.in);
		int size= sc.nextInt();
		 int arr[]= new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	public static void print(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int n =sc.nextInt();
		int arr[]=inputarray();
	//System.out.println(arr);
	
	print(arr);
	
	//int k=find_unique(arr);
	//System.out.println(k);
	//int p=find_duplicate(arr);
	//System.out.println(p);
	 square(arr);
	//System.out.println(p);
	
	}

	
}
