package Array;

public class LastIndex {

	
	public static int lastIndex(int arr[],int x)
	{
		
		return lastIndex(arr,x,0);
	}
	
	public static int lastIndex(int arr[],int x,int start)
	{
		if(start==arr.length)
		{
			return -1;
		}
		int ans=lastIndex(arr,x,start+1);
		if(ans!=-1)
		{
			return ans;
		}
		
		if(arr[start]==x)
		{
			
			return start;
		}
		else
		{
			return -1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,7,6,7};
		int x=7;
		System.out.println(lastIndex(arr,x));
		
	}

}
