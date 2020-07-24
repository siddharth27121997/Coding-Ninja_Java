import java.util.*;
public class Pallindrome {
public static boolean checkpallindrome (String str)
{
int temp = str.length()-1;
for(int i=0;i<temp;i++)
{
	if(str.charAt(i)!=str.charAt(temp))
	{
		return false;
	}
	temp--;
}
	return true;
}
	//return true;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
String str= sc.nextLine();
String gfg = str.toUpperCase();

	
System.out.println(checkpallindrome(str));
	


	}

}
