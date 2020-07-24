
public class Find_Unique {

	public static int find_unique(int arr[])
	{
	for(int i=0;i<arr.length;i++)
	{ 
		int j;
		for(j=0;j<arr.length;j++)
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
	return -1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,3,2,1,1,4,2};
System.out.println(find_unique(arr));
	}

}
