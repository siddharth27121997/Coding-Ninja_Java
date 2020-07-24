package Array;

public class ArraySum {
public static int sum(int arr[]) 
{
	if(arr.length==0)
	{
		return 0;
	}
	int sumarr[]= new int[arr.length-1];
	for(int i=1;i<arr.length;i++)
	{
		sumarr[i-1]=arr[i];
	}
	
	int ans=sum(sumarr);
	int a =arr[0]+ans;
	return a;
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {3,4,5};
		
 System.out.println(sum(arr));
	}

}
