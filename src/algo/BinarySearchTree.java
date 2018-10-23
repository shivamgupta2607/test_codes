package algo;

import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class BinarySearchTree {
	public static boolean v1 = false;
	public static boolean v2 = false;

	Node root;
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean search(Node r,int data)
	{
		
		while(r!=null)
		{
			if(data==r.data)
				return true;
			else if(data<r.data)
				r=r.left;
			else
				r=r.right;
		}
		return false;
	}
	public Node searchRecursive(Node r, int data)
	{
		if(r==null || r.data == data)
			return r;
		else if(r.data>data)
			return searchRecursive(r.right, data);
		else
			return searchRecursive(r.left, data);
	}
	
	

	public Node insertRecursive(Node r, int data)
	{
			Node t = new Node(data);
			if(r==null)
				return t;
			else if(data<r.data)
				r.left =  insertRecursive(r.left, data);
			else
				r.right =  insertRecursive(r.right, data);
			return r;
	}
	
	
	public void inorderRecursive(Node r)
	{
		if(r==null)
			return;
		inorderRecursive(r.left);
		System.out.println(r.data);
		inorderRecursive(r.right);
	}
	
	public void inorderItr(Node r)
	{
		if(r==null)
			return;
		Node c = r;
		Stack<Node>  s = new Stack<>();
		while(c!=null || !s.isEmpty())
		{
			while(c!=null)
			{
				s.push(c);
				c = c.left;
			}
			c = s.pop();
			System.out.println(c.data);
			c = c.right;
		}
		
	}
	
	public void preOrder(Node r)
	{
		if(r==null)
			return;
		Stack<Node> s1 = new Stack<>();
		s1.push(r);
		while (!s1.isEmpty())
		{
			int data = s1.pop().data;
			System.out.println(data);
			s1.push(r.right);
			s1.push(r.left);
			
		}
		
	}
	
	public void postOrder(Node r)
	{
		if(r==null)
			return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(r);
		
		while(!s1.isEmpty())
		{
			Node t = s1.pop();
			s2.push(t);
			if(t.left!=null)
				s1.push(t.left);
			if(t.right!=null)
				s1.push(t.right);
		}
		while(!s2.isEmpty())
			System.out.println(s2.pop().data);
	}
	
	
	public void levelOrder(Node r)
	{
		if(r==null)
			return;
		
		Queue<Node> q= new LinkedList<>() ;
		
		q.add(r);
		while(!q.isEmpty())
		{
			Node t = q.poll();
			System.out.println(t.data);
			if(t.left!=null)
				q.add(t.left);
			if(t.right!=null)
				q.add(t.right);
		}
		
		
	}
	
	
	public int height(Node r)
	{
		if(r==null)
			return 0;
		int lHeight= height(r.left);
		int rHeight = height(r.right);	
		return lHeight>rHeight?lHeight+1:rHeight;

	}
	
	public int heightItr(Node r)
	{
		if(r==null)
			return 0; 
		Queue<Node> q = new LinkedList<>();
		q.add(r);
		int height =0;
		while(true)
		{
			int nodeCount = q.size();
			if(nodeCount==0)
				return height;
			height++;
			while(nodeCount>0)
			{
				q.poll();
				if(r.left!=null)
					q.add(r.left);
				if(r.left!=null)
					q.add(r.right);
				nodeCount--;
			}
			
		}
	}
	
	public void printSpiralOrder(Node r)
	{
		if(r==null)
			return;
		Queue<Node> q= new LinkedList<>();
		q.add(r);
		
		while(true)
		{
			boolean flag = true;
			int nodeCount = q.size();
			if(nodeCount==0)
				break;
			while(nodeCount>0)
			{
				System.out.println(q.poll());
				if(flag)
				{
					if(r.left!=null)
						q.add(r);
					if(r.right!=null)
						q.add(r);
				}
				else
				{
					if(r.right!=null)
						q.add(r);
					if(r.left!=null)
						q.add(r);
				}
				
			}
			flag= !flag;
		}
	}
	TreeMap<Integer, Node> topView = new TreeMap<>();
	
	public void printTopView(Node r, int n)
	{
		if(r==null)
			return;
		
		topView.put(n, r);
		printTopView(r.left, n-1);
		printTopView(r.right, n+1);
	}
	
	class QueueObj{
		int hd;
		Node r;
		public QueueObj(int hd, Node r) {
			this.hd  =hd;
			this.r = r;
		}
	}
	
	public void printTopViewItr(Node r)
	{
		if(r==null)
			return;
		TreeMap<Integer, Node> topViewMap = new TreeMap<>();
		Queue<QueueObj> q = new LinkedList<>();
		
		q.add(new QueueObj(0, r));
		
		while(!q.isEmpty())
		{
			QueueObj t = q.poll();
			if(!topViewMap.containsKey(t.hd))
				topViewMap.put(t.hd, t.r);
			if(t.r.left!=null)
				q.add(new QueueObj(t.hd-1, r.left));
			if(t.r.right!=null)
				q.add(new QueueObj(t.hd+1, r.right));
		}
		
		for(Entry<Integer, Node> entry : topViewMap.entrySet())
			System.out.println(entry.getValue().data);
	}
	
	public Node inorderSuccessor(Node r, Node n)
	{

		if(n.right!=null)
		{
			Node t = n.right;
			while(t.left!=null)
				t= t.left;
			return t;
		}
		else
		{
			Node s=null;
			while(r!=null)
			{
				if(r.data>n.data)
				{
					s=r;
					r=r.left;
				}
				else if(r.data<n.data)
				{
					r=r.right;
				}
				else
				{
					break;
				}
			}
			if(s==null)
			{
				System.out.println("Inorder Successor is  not present");
			}
		}
		return null;
		
	}
	
	Node findLCA(Node r, int n1 , int n2)
	{
		v1 = false;
		v2 = false;
		Node n  = findLCAReccur(r, n1, n2);
		if(v1&&v2)
			return n;
		else
			return null;
		
		
	}
	private Node findLCAReccur(Node r, int n1, int n2) {
		Node temp=null;
		if(r.data == n1)
		{
			v1 = true;
			temp = r;
		}
		if(r.data == n2)
		{
			v2 = true;
			temp = r;
		}

		if(temp != null)
			return temp;
		
		Node left_lca = findLCAReccur(r.left, n1,  n2);
		Node right_lca = findLCAReccur(r.right, n1, n2);
		
		if(left_lca!=null && right_lca!=null)
			return r;

		else {
			if (left_lca == null)
				return left_lca;
			else
				return right_lca;
		}
	}

	public int depth(Node node)
	{
		if(node == null)
			return 0;
		int lDepth = depth(node.left);
		int rDepth = depth(node.right);
		return Math.max(lDepth, rDepth)+1;	
	}
	
	
	public int depth(Node node, int data, int level)
	{
		if(node==null)
			return -1;
		if(node.data == data)
			return level;
		int leftDepth = depth(node.left, data, level+1);
		if(leftDepth!=-1)
			return leftDepth;
		else
			return depth(node.right, data, level+1);
	}
	
	
	 
	
}
