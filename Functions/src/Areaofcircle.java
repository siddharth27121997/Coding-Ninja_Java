import java.util.*;
public class Areaofcircle {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
    public static double area(double a)
    {
    	double ar = (3.14*a*a);
    	return ar;
    }
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble(); 
			double result=area(a);
		System.out.println(result);	

		
		}
		
		
	}


