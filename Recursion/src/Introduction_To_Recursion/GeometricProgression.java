package Introduction_To_Recursion;

public class GeometricProgression {

	public static double geometric(int k)
	{
		if(k==0)
		{
			return 1;
		}
		else
		{
			return geometric(k-1)+1/Math.pow(2, k);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=50;
		System.out.println(geometric(k));
	}

}
