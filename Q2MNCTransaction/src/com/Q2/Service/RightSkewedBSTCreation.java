package com.Q2.Service;

import com.Q2.Model.Node;

public class RightSkewedBSTCreation {
	
	static Node prevNode = null;
	public Node rootNode = null;
	
	//Method to convert BST to right skewed tree
	public Node rightSkewedBST(Node node) {
		
		if (node == null)
			return null;
		
		//Recurse for the left side of the tree first
		rightSkewedBST(node.left);
		
		Node rightNode = node.right;
	
		//Check if root node of the skewed tree is not defined
		if (rootNode == null) 
			rootNode = node;
			
		else 
			prevNode.right = node;
			
		node.left = null;
		prevNode = node;
		
		//Recurse for the right subtrees
		rightSkewedBST(rightNode);
		
		return rootNode;
	}
}