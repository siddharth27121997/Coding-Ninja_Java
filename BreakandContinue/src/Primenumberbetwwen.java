import java.util.*;
public class Primenumberbetwwen {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}


//import java.util.*;
//public class Solution {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d =2;
       //int count=0; 
        //boolean isprime = true;
    for(int i =2;i<n;i++)
    {
    	boolean isprime=true;
    	for(int j=2;j<i;j++)
    	{
    		if(i%j==0)
    		{
            			isprime=false;
            			break;
    			
    		}
    		
    	}
    	if (isprime)
    	{
    		System.out.println(i);
    	}
    	
    }
	}
}
		
	

