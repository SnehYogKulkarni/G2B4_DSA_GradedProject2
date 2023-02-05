package com.Q2.Model;
import java.util.*;

public class BinarySearchTree {
	Node root;
	public  Node insertNode(Node node, int key) {
		if (node == null) {
			node = new Node(key);
			return node;
		}
		
		if (key < node.data) 

			node.left = insertNode(node.left, key);
		 else 
			node.right = insertNode(node.right, key);
		
		return node;
	}

	public Node createBST() {

		int key, n;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("\n Enter number of number of transctions to be  done :: ");
		n = sc.nextInt();
		
		System.out.println("\n Value of transction  must be DISTINCT ");
		for (int i = 0; i < n; i++) {
			
			System.out.print("\n Enter value of transction :: "+i+1);
			key = sc.nextInt();
			root = insertNode(root, key);
		}
		
		sc.close();
		
		return root;
	}

	//Method to traverse the created tree
	public void inorderBST(Node node) {
		
		if(node != null) {
			
			inorderBST(node.left);
			System.out.print(" " +node.data);
			inorderBST(node.right);
		}
			
	}
	
	
}