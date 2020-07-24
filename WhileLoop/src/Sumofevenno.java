import java.util.*;
public class Sumofevenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	import java.util.*;
	//	public class Solution {


//			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int N;
		        N=sc.nextInt();
		        //float f = 1.78f ;
				/* Your class should be named Solution.
			 	* Read input as specified in the question.
			 	* Print output as specified in the question.
				*/
		          int i=2,sum=0;
		        while(i<=N)
		            
		        {
		            if (i%2==0)
		            {
		                sum= sum+i;
		                
		            }
		                i++;
		            
		        } 
		        System.out.println(sum);
				
			}

		

	}


