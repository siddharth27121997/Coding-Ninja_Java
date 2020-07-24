package Introduction_To_Recursion;

public class Print_the_numbers {

	public static void reverse_print(int n)
	{
		if(n==1)
		{
			System.out.print(n+" ");
			return ;
		}
		//print(n-1);
		System.out.print(n+" ");
		reverse_print(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    reverse_print(5);
	}

}
