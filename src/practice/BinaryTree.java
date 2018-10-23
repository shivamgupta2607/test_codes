package practice;

public class BinaryTree {
	static boolean v1= false;
	static boolean v2 = false;
	static Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public BinaryTree() {
		root = null;
	}
	
	public void insert(Node root ,int data)
	{
		
		
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
	
	
	
	public Node findLca(Node node, int n1, int n2)
	{
		v1= false;
		v2=false;
		Node lca = findLCARecur(node, n1, n2);
		if(v1&&v2)
			return lca;
		else
		{
			System.out.println("Nodes could not be found");
			return null;
		}
	}
	
	public Node findLCARecur(Node node , int n1, int n2)
	{
		Node temp =null;
		if(node.data==n1)
		{
			v1 = true;
			temp = node;
		}
		if(node.data==n2)
		{
			v2=true;
			temp= node;
		}
		if(temp!=null)
			return temp;
		
		Node lLca= findLCARecur(node.left, n1, n2);
		Node rLca= findLCARecur(node.right, n1, n2);
		if(lLca!=null && rLca!=null)
			return node;
		if(lLca==null)
			return rLca;
		else
			return lLca;
	}
	
	public static void main(String[] args) {
		BinaryTree  bt = new BinaryTree();
		
		bt.depth(root);
	}
}
