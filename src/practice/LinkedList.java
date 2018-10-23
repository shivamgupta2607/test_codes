package practice;

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
	
	public void reverse(Node node)
	{	
		node = head;
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(node!=null)
		{
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
					
		}
		head = curr;
	}
	
	public  Node detectCycle(Node node)
	{
		Node h = node;
		Node t = node;
		while(t!=h  && t!=null  &&  h.next!=null)
		{
			h=h.next.next;
			t=t.next;
		}
		if(t==null || h ==null || h.next == null)
			return null;
		else
			return t;
	}
	
	public Node findFirstNodeOfCycle(Node node)
	{
		if(detectCycle(node)==null)
		{
			return null;
		}
		else
		{
			Node s = head;
			Node f = detectCycle(node);
			while(f!=s)
			{
				f=f.next;
				s=s.next;
			}
			return f;
		}
	}
	
}
