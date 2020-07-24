package Classes_objects;

public class Generic_Function {

	public static <T> void array(T arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= new Integer[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		array(a);
		
	}

}
