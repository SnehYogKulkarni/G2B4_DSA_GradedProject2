package com.Q2.Model;

public class Node {
	
	public int data;
	public Node left, right;
	
	public Node(int key) {
		this.data = key;
		this.left = null;
		this.right = null;
	}
}