
//371public class Armstrong {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub


import java.util.*;
import java.lang.*;
public class Armstrong {
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
        long orignalnum=n;
       // boolean a =false;
          //  int i =1;
        long sum=0;
     //   int temp = n;
        long  digit=0;
        
        digit = (long) Math.log10(n) + 1; 
          
            while(orignalnum>0)
            {
       	long	 rem=orignalnum%10;
                sum=sum+(long)Math.pow(rem,digit);
                orignalnum=orignalnum/10;
            }
        
              if(sum==n)
              {
                 System.out.println("true");
                  
              }
        else
        {
        	
        
        
            System.out.println("false");
        }
            //return false;
        System.out.println(digit);
                
                System.out.println(sum);
            
        
	}
}
