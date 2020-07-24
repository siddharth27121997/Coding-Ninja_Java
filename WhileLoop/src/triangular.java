import java.util.*;
public class triangular {
    
    public static void main(String[] args) {
        // Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2!=0)
        {
        	int n1=((n+1)/2);
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
                while(j<=2*i-1)
                {
                    System.out.print("*");
                j++;
                        
            }
                
            
            
            i++;
            System.out.println();
        }
            
    }       
    }
}