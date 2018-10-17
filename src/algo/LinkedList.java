package algo;

public class LinkedList {
	Node head;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

private void addNodeAtBeginning(int data)
{
	Node t = new Node(data);
	
	if(head == null)
	{
		head = t;
	}
	else
	{
		t.next=head;
		head = t;
	}
	Node temp = head;
	
	
	
}

private void addNodeAtEnd(int data)
{
	Node t = new Node(data);
	if(head == null)
	{
		head = t;
	}
	else
	{
		Node temp = head;
		while(temp!=null)
		{
			temp = temp.next;
		}
		temp.next = t;
	}	
}

private void addNodeAfterNode(int data, int nodeData)
{
	Node t = new Node(data);
	if(head != null)
	{
		Node temp = head;
		while(temp.data != nodeData && temp!=null)
		{
			temp = temp.next;
		}
		if(temp==null)
		{
			System.out.println("Key not found");
		}
		else
		{
			t.next = temp.next;
			temp.next = t;
		}
	}
	else
	{
		System.out.println("Linked list is not initialized yet!!");
	}
}

private void reverse()
{
	Node prev = null;
	Node curr = head;
	Node next = null;;
	while (curr != null)
	{
		next = curr.next;
		curr.next = prev;
		prev=curr;
		curr = next;
	}
	head = curr;
}

private Node detectCycle()
{
	Node t  = head;
	Node h = head;
	while(t != h && t!=null && h!=null && h.next!=null )
	{
		t= t.next;
		h=h.next.next;
	}
	
	if(t == null || h== null || h.next ==null)
	{
		System.out.println("Cycle is not present");
		return null;
	}
	return t;
	
	
	
}
public static void main(String[] args) {
	
}





}
