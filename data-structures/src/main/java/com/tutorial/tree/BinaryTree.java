package com.tutorial.tree;

public class BinaryTree {

	Node root;
	
	public Node addRecursive(Node current,int value) {
		
		if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
		
		return current;
		
	}
	
	public void add(int key) {
		root = addRecursive(root, key);
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		 
	    bt.add(10);
	    bt.add(9);
	    bt.add(8);
	    bt.add(7);
	    bt.add(6);
	    bt.add(5);
	    bt.add(4);
	}
	
}
