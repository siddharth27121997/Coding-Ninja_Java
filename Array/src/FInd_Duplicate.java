
public class FInd_Duplicate {

	
	public static int duplicate(int arr[])
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
						return arr[i];
						
					}
					
				}
				
			}
	
			
			
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,5,4,5,5};
	System.out.println(duplicate(arr));
	}

}
