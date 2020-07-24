package Pattern;

import java.util.Scanner;

public class Charecterpattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//char ch = sc.nextLine().charAt(0);
		int i=1,p='A';
		while(i<=n)
		{
           int j=1;
           while(j<=n)
           {
        	   System.out.print((char)(p+j-1));
        	   j++;
        	   
           }
		p++;

			i++;
			System.out.println("");
			
	}

}

}