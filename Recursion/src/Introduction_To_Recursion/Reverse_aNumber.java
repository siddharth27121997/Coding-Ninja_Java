package Introduction_To_Recursion;

public class Reverse_aNumber {
	
	//public class solution {

		public static int func(int input)
	    {
			// Write your code here
	        
	        return func(input,0);
	        

		}
	    
	    
	        public static int func(int input,int sum)
	        {
	            if(input==0)
	            {
	                return 0;
	            }
	            else
	            {
	            sum+=input%10;
	            return sum+func(input/10);
	        }
	        }
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=1234;
	System.out.println(func(1234));
	}

}
