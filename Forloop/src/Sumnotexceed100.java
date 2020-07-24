/*
import java.util.*;
public class Sumnotexceed100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int sum=0;
for(int i=0;i<=n&&sum<1000;i++)
{
	sum=sum+i;
	
}

System.out.println(sum);
	}

}
*/

import java.util.*;
public class Sumnotexceed100 {


	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int sum=0;
        int a=0,b=1;//sum;
        while(i<n)
        {
             sum=(a+b);
            a=b;
            b=sum;
    i++;
        }
        
       System.out.println(sum);
    
    }
}

