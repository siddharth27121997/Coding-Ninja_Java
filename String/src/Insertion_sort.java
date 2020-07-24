
public class Insertion_sort {

	public static void insertion_sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 )
			{ 
				if(arr[j]>arr[j+1])
			
			{
				
				
					arr[j+1]=arr[j];
					arr[j]=temp;
				j--;
				
				
			}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,1,23,2,4};
		insertion_sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
