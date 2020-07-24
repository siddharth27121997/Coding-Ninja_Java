import java.util.Scanner;
public class Reverse_a_String {

	/*
	 * public static void reverse(String str) { for(int i=str.length()-1;i>=0;i--) {
	 * System.out.print(str.charAt(i)); } System.out.println();
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner s= new Scanner(System.in); String str= s.next(); reverse(str);
	 * 
	 * }
	 * 
	 */
public static void reverse1(String str)
{
char arr[]= str.toCharArray();
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+"");
}
	System.out.println();
	
}

public static void main(String args[])
{
	String str="Melo";
	reverse1(str);
}


}