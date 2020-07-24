
public class Insertion_sort_onemore {

	public static  int[] function(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)
			{
				
				
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,3,8,7,9};
		int k[]=function(arr);
		for(int i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" ");
		}
		System.out.println();
	}

}
