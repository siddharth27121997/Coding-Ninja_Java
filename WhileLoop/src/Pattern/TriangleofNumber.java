package Pattern;


		
		
		
		import java.util.*;
		public class TriangleofNumber  {
		    
		    public static void main(String[] args) {
		        // Write your code here
		        
		        Scanner sc = new Scanner(System.in);
		        int n= sc.nextInt();
		        if(n%2!=0)
		        {
		            int i =1;
		            while(i<=n)
		            {
		                int space =1;
		                while(space<=n-i)
		                {
		                System.out.print(" "); 
		                space ++;
		                
		                }
		                int j=1;
		                while(j<=i)
		                {
		                    System.out.print("*");
		                j++;
		                        
		            }
		               j=1;
		            while(j<=i-1)
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


