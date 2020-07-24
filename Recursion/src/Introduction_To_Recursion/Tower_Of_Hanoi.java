package Introduction_To_Recursion;

public class Tower_Of_Hanoi {

	public static void hanoi(int n, char a,char b, char c)
	{
		if(n<1)
		{
			return ;
		}
		hanoi(n-1,a,c,b);
		System.out.println("Move disk " + n + " from " + a + " to "  +c);
		hanoi(n-1,b,a,c);
			
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		hanoi(n,'a','b','c');
		
	}

}
