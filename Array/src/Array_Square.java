
public class Array_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,1,5};
int a=0;
//int sum=0;
for(int i=0;i<arr.length;i++)
{
int sum=0;
	for(int j=0;j<arr.length;j++)
	{
		
		if(i!=j)
		{
			 a=(int)Math.pow(arr[j], 2);
		  sum+=a;  	
		}
	}
	System.out.println(sum);
}
	

		
		
		
		
		
		
	}

}
