
public class Reverse_The_letter_Of_Each_Word {

public static String rev(String str)
{
	String output="";
	String reverse="";
	String output1="";
	int start=0;
	int temp;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			temp=i-1;
			for(int j=temp;j>=start;j--)
			{
				reverse=reverse+str.charAt(j);
		        
				
		}
		start=i+1;
		output+=reverse+" ";
		reverse="";
		
		}
		
	}

	for(int j=str.length()-1;j>=start;j--)
	{
		reverse=reverse+str.charAt(j);
	
	}
	output+=reverse;

int k=output.length()-1;
int end=output.length();
while(k>=0)
{
	if(output.charAt(k)==' ')
	{
		output1=output1+output.substring(k+1,end)+" ";
	end=k;
	}
	
	k--;
}
	output1+=output.substring(0,end);
	String papu=output1.toUpperCase();
	return papu;
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome To Coding Ninja";
//String papu= str.toLowerCase();
		System.out.println(rev(str));
	}

}
/*
 * public class solution {
 * 
 * public static String removeAllOccurrencesOfChar(String input, char c) { //
 * Write your code here int start=0; String output=""; String output2=""; String
 * output1=""; int temp=0; for(int i=0;i<str.length();i++) {
 * if(str.charAt(i)==c) { output=output+str.substring(start,i);
 * 
 * temp=i+1;
 * 
 * }
 * 
 * if(str.charAt(i)==' ') { output1=output1+str.substring(temp,i);
 * output2=output2+output+output1+""; output1=""; output=""; }
 * 
 * 
 * 
 * }
 * 
 * return output2; }
 * 
 * }
 */