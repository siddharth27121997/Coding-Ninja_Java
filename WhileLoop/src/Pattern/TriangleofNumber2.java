package Pattern;

		
		
		import java.util.Scanner;

		public class TriangleofNumber2 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int n =sc.nextInt();
		        int i =1;
		       // int ptr=i;
		        while(i<=n)
		        {
		            int space=1;
		            int j=1;
		            while(space<=n-i)
		            {
		                System.out.print(" ");
		                space++;
		                
		            }
		            int p =i;
		            //int j=1;
		            while(j<=i)
		            {
		                System.out.print(p);
		                j++;
		                p++;
		            }
		            j=1;
		            
		            p=(2*(i-1));
		                // ptr=ptr+i;
		            
		            while(j<=i-1)
		            {
		                
		                System.out.print(p);
		                    p--;
		                j++;
		            }
		            // ptr=ptr+1;
		            
		        
		        
		            i++;
		            System.out.println();
		        }
		        
			}
		

		

	

}
