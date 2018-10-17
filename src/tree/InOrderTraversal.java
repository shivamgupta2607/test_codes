package tree;

import java.util.Stack;

class Node
{
	Node left;
	Node right;
	int data;
	Node(int data)
	{
		this.data= data;
		this.left = null;
		this.right = null;
	}
}

public class InOrderTraversal {

	Node root;
	
	private void inorderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		while(node != null)
		{
			stack.push(node);
			node = node.left;
		}
		
		while ( stack.size() != 0)
		{
			node = stack.pop();
			System.out.print(node.data+ "   ");
			if(node.right != null)
			{
				node = node.right;
				while(node != null)
				{
					stack.push( node );
					node = node.left;
				}
			}
		}
	}
	
	private void inorderTraversalRec(Node root)
	{
		Node node = root;
		if (node == null)
		{
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node.data+ "  ");
		inorderTraversal(node.right);
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
	
}
