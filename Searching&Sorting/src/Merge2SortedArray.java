import java.util.*;
public class Merge2SortedArray {

	public static int[] merge(int arr1[],int arr2[])
	{
		int size= arr1.length+arr2.length;
		int arr3[] = new int[size];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length )
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				
				arr3[k]=arr2[j];
				
				k++;
				j++;
			}
			
		}
	while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
	return arr3;	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int p=sc.nextInt();
		int arr1[]= new int[n];
		int arr2[]= new int[p];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= sc.nextInt();
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]= sc.nextInt();
		}
		
	
		int ans[]=merge(arr1,arr2);
		for(int i=0;i<ans.length;i++)

		{
			System.out.print(ans[i]+" ");
		}
		
	}

}
