import java.util.*;
import java.lang.*;
public class Salary {
	
	public static void main(String[] args) {
        
        
		// Write your code here
        int basic;
        Scanner sc = new Scanner(System.in);
        basic = sc.nextInt();
        char grade=sc.next().charAt(0);
        double totalSalary =0;
        int allow=0;
        double hra =(double)0.2*basic;
        double da= (double)0.5 *basic;
        if(grade == 'A')
        {
             allow = 1700;
        }
        
        if(grade=='B')
            
        {
            allow = 1500;
//import java.util.*;
        }    
        else if (grade >='C')
        {
            allow = 1300;
        }
        double pf=(double)0.11*basic;
        
            totalSalary= basic+hra+da+allow-pf;
        
        System.out.println(Math.round(totalSalary));        
    }
    
}  
    
    