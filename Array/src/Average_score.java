import java.lang.*;
import java.util.*;
public class Average_score {
	
	

	 public static double calculateAverage(int []age)
	    {
	        double sum=0;
	        double avg=0;
	        int size= age.length;
	        for(int i=0;i<size;i++)
	        {
	         sum=sum+age[i];
	        avg=(double)(sum/(double)size);    
	        }
	        
	        return avg;
	    }
	    
	    public static void main(String args[])
	    {
	    	int count=0;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter total no. of employees:");
	        int n=sc.nextInt();
	        if(n>=2)
	        {
	            System.out.println("Enter the age for "+ n +" employees");
	            int arr[]= new int[n];
	            for(int i=0;i<arr.length;i++)
	            
	            {
	            	arr[i]= sc.nextInt();
	            if(arr[i]<28 || arr[i]>40)
	            {
	            	//System.out.println("Invalid");
	            	count++;
	            	break;
	            }
	            }
	            if(count==0)
	            {
	            	
	            
	            double x=(double)calculateAverage(arr);
	            
	           //String.format("%.2f", x);
	        System.out.println("The average is"+String.format("%.2f",x));    
	            }
	            if(count==1)
	            {
	            	System.out.println("Invalidage");
	            	System.exit(0);
	            }
	            	
	        
	            
	        
	        }
	        else
	        {
	        	
	        
	       
	       System.out.println("Please enter a valid employee count");
	        }
	        }
	       
	    }
	    
	    
	