
public class Selection_sort {

	public static int[] selection_sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int min_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					min_index=j;
				}
			}
			if(i!=min_index)
			{
				int temp=arr[i];
				arr[i]=min;
				arr[min_index]=temp;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n =10;n<=1000000;n*=10)
		{
			int arr[]= new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=arr.length-1;
			}		
		
		long startTime= System.currentTimeMillis();
      		selection_sort(arr);
		long endTime=System.currentTimeMillis();
		
		System.out.println("Time for selection sort  " +n+ "  is " +(endTime-startTime));
	}

}
}
