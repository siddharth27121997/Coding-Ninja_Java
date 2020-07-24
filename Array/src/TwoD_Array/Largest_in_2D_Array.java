package TwoD_Array;

public class Largest_in_2D_Array {

	public static void largest_2d(int arr[][])
	{
		int row=arr.length;
		int col=arr[0].length;
		int largest= Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int j=0;j<col;j++)
		{
			int sum=0;
			int start=0;
			//int end=row;
			while(start<row)
			{
				sum=sum+arr[start][j];
				start++;
			}
			if(sum>largest)
			{
				second_largest=largest;
				largest=sum;
			}
			if(sum<largest && sum>second_largest && sum!=largest)
			{
				second_largest=sum;
			}
			
			
		}
		System.out.print(second_largest+" ");
		System.out.println(largest);
	//	return largest;
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{9,4,3},{4,5,6}};
		largest_2d(arr);
		//System.out.println(k);
        
		
	}

}
