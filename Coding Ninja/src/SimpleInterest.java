import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double p,r,t,si;
	p=sc.nextInt();
	r=sc.nextInt();
	t= sc.nextInt();	
		// TODO Auto-generated method stub
si=((p*r*t)/100);
	
System.out.print(si);

}
}