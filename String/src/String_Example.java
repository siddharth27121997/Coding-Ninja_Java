
public class String_Example {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String g="abcd3";
String f="abcd3";
char ch[] = g.toCharArray();
char gg[]= f.toCharArray();
boolean div=true;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]!=gg[i])
	{
		div=false;
		System.out.println("Your array is not my cup of tea");
		break;
	}
}
	if(div==true)
	{
		System.out.println("True");
	}

}
}