import java.util.*;
public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int rem=0;
	//	Scanner sc = new Scanner(System.in);
	//	int n= sc.nextInt();
		for(int i=2;i<100;i++)
		{
		
		int d=2;
	boolean b = false;
		while(d<i)
		{
	//		boolean b =true;
			if(i%d==0)
			{ 
				b= true;
				//System.out.println("Not prime");
		//	b = true;
			//d++;
				break;
			}
			d++;
			
		}
		if(!b)
		{
			int rem=i%10;
		if(rem==1)
		{
		System.out.println(i);
		}
		
		
		
	}

}
		}
}