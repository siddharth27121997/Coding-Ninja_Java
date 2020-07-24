import java.util.*;
public class Sumof2Drows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int sum=0;
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]= sc.nextInt();
				
			}
			
		}
		
		for(int i=0;i<row;i++)
		{
	int sum=0;
	for(int j=0;j<col;j++)
			{
				sum+=arr[i][j];
			}
		System.out.print(sum+" ");
		}
		
		
	}

}
