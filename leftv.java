package assignments;

import java.util.Scanner;
public class leftviewofbtree {
	static class Node {
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=right=null;
		}
	}
	static Node root;
	public static void insert(int key) {
		root=insertn(root,key);
	}
	public static Node insertn(Node root,int key) {
		if(root==null) {
			root=new Node(key);
		}
		else if(root.data>key) {
			root.left=insertn(root.left,key);
		}
		else if(root.data<key) {
			root.right=insertn(root.right,key);
		}
		return root;
	}
	public void leftview() {
		leftv(root,1);
	}
	static int level=0;
	public void leftv(Node root,int n) {
		if(root==null)
			return;
		if(level<n) {
			System.out.println(root.data+" ");
			level=n;
		}
		leftv(root.left,n+1);
		leftv(root.right,n+1);
	}
	public static void main(String arg[]) {
		leftviewofbtree li=new leftviewofbtree();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of data ");
		int n=sc.nextInt();
		System.out.println("Enter the data value");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			li.insert(num);
		}
		li.leftview();

	}
}
