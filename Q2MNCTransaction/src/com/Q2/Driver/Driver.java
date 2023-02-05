package com.Q2.Driver;
import java.util.*;

import com.Q2.Model.*;
import com.Q2.Service.*;

public class Driver {

	static Node root, skewedRoot;
	public static void main(String[] args) {
	
		RightSkewedBSTCreation rightBST = new RightSkewedBSTCreation();
	
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bstTree = new BinarySearchTree();
		
		root = bstTree.createBST();
		
		System.out.println("\n Inorder Traversal of given BST :: ");
		bstTree.inorderBST(root);	
		
		//Converting the BST to right skewed tree
		skewedRoot = rightBST.rightSkewedBST(root);
		
		//Traversing the created right skewed tree by traversing each node
		System.out.println("\n Node values in ascending order: ");
		
		bstTree.inorderBST(skewedRoot);	
		
		
		sc.close();
	}
}