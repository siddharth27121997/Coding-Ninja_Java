package Pattern;
import java.util.*;
public class Diamondofstar {
    
    public static void main(String[] args) {
        // Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2!=0)
        {
        	int n1=(n+1)/2;
            int i =1;
            while(i<=n1)
            {
                int space =1;
                while(space<=n1-i)
                {
                System.out.print(" "); 
                space ++;
                
                }
                int j=1;
                while(j<=(2*i-1))
                {
                    System.out.print("*");
                j++;
                        
            }
             /*  j=1;
            while(j<=i-1)
            {
                System.out.print("*");
                j++;
            }
 */           
             i++;
             System.out.println();
            }
            
            int n2=(n)/2;
            i=n2;
            while(i>=1)
            {
            int space2= 1;
            while(space2<=n2-i+1)
            {
            	System.out.print(" ");
            	space2++;
            }
            int p=1;
            while(p<=(2*i-1))
            {
            	System.out.print("*");
            p++;
            }
            i--;
            System.out.println();
            	
            }
            
            
    }       
    }
}