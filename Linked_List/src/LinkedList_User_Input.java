import java.util.Scanner;
public class LinkedList_User_Input {
public static Node3<Integer> takeinput()
{
Scanner sc = new Scanner(System.in);
int data= sc.nextInt();
Node3<Integer> head = null,tail=null;
while(data!=-1)
{
	
	Node3<Integer> new_node= new Node3<Integer>(data);
	if(head==null)
	{
	
	head=new_node;
	tail=new_node;
	}
	else
	{
		tail.next=new_node;
		tail=new_node;
	}
data=sc.nextInt();	

}
return head;
}
	public static void print(Node3<Integer>head)
	{
		
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Node3<Integer> 	head= takeinput();
 print(head);
 
		
	}

}
