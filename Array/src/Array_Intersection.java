
public class Array_Intersection {

	public static void array_intersection(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr1[]= {3,4,5,6,3};
	int arr2[]= {5,3,4,5,1,3};
	array_intersection(arr1,arr2);
	}

}
