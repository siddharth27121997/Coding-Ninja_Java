import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int y = sc.nextInt();
if(((y%4==0)&&(y%100!=0))||(y%400==0))
{
	System.out.println("You are in"+"Leap year"+" "+y);
	
}
else
{
	System.out.println(y+" "+"Not a leap year");
}

	}

}
