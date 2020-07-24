
public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int arr[]= {3,2,1,4};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
			System.out.println();

	int count=(int)Math.log10(n)+1;
	int arr1[]= new int[count];
	for(int i=0;i<arr.length;i++)
	{
		arr1[i]=n%10;
		
		n/=10;
		
	}
	
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr1[i]+" ");
}
System.out.println();
	
	}
	
	
	
	

}
