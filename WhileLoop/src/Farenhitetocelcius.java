import java.util.*;

public class Farenhitetocelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int s= sc.nextInt();
int w = sc.nextInt();
int t= sc.nextInt();
int start= s;
while(s<w)
{
	int c =(int)(5.0/9)*(s-32);
	System.out.println(c+ "/t" +start);		
 start = start+w;
}

	}

}
