import java.util.*;

public class String_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcd";
		// System.out.println(str);
		String t = "abcd";
		char a[] = str.toCharArray();
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		System.out.println(str.substring(str.length()));
		// emptystring
		
		 String p=str.substring(str.length());
		 System.out.println(p.length());//length is zero
		 String ko=(str.substring(str.length())); // string index out of bound
		 System.out.println(ko.length());
		  
		 char b[] = t.toCharArray();

		if (str==t) {
			System.out.println("true");
		} else {
			System.out.println("No");
		}

		if (str.equals(t)) {
			System.out.println("Equal1");
		}
	}
}
