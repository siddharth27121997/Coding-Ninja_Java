import java.util.*;
public class Student_Use {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Student s1= new Student();
		Student s2= new Student();
		s1.name="Row";
		s1.rollnumber=123;
		s2.name="Patrick";
		s2.rollnumber=1234;
		System.out.println(s1);// displaying the address where s1 is stored.
		System.out.println(s1.name);
		System.out.println(s1.rollnumber);
		System.out.println(s2.name);
		
		System.out.println(sc);
		
		
		
		
		
	}

}
