import java.util.*;
public class CountNo_ofWords {

	
	
	
	
	public static int count(String str)
	{
		int count=1;
	 for(int i=0;i<str.length();i++)
	 {
		 if(str.charAt(i)==' ')
		 {
			 count++;
		 }
		 
	 }
		
	return count;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	int x=count(s);
	System.out.println("No. of counts:"+x);
	
	}

}
