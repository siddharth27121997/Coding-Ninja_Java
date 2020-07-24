//
//public class runner {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}
import java.util.*;
public class runner {

	public static void main(String[] args) {
		// Write your code here

	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int i =1;
        //int j=n;
        while(i<=n)
        {
        	int j=n;
            while(j>=1)
            {
                if(j!=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print("*");
                }
                j--;
            }
            System.out.println();
            i++;
            
        }
    }
}