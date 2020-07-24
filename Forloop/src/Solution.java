import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //int d =2;
    for(int i=1;i<n;i++)
    {
        boolean div = false;
        int d=2;
        for(d=2;d<n;d++)
        {
            if(i%d==0)
            {
                div = true;
                break;
            }
            
        
        }
        
        if(!div)
        {
            System.out.println(i);
        }
        
    }
    
    }
}