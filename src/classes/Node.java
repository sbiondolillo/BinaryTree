/*
 * Node Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a class to model the nodes of a binary tree
 * Version  0.0.1   9/26/17
 */

package classes;

import interfaces.BinaryTreeNode;

public class Node implements BinaryTreeNode {
	
	private Node leftChild;
	private Node rightChild;
	private int value;
	
	
	/*
	 * Constructor
	 * @param value - any int
	 */
	public Node(int value) {
		this.value = value;
	}
	/*
	 * Getters and setters for instance variables
	 */
	@Override
	public Node getLeftChild() {
		return leftChild;
	}
	@Override
	public void setLeftChild(Node node) {
		leftChild = node;
	}
	@Override
	public Node getRightChild() {
		return rightChild;
	}
	@Override
	public void setRightChild(Node node) {
		rightChild = node;
	}
	@Override
	public int getValue() {
		return value;
	}
	@Override
	public void setValue(int value) {
		this.value = value;
	}
	
	/*
	 * Provide a readable format for printing Nodes
	 */
	@Override
	public String toString() {
		String output = "";
		output += (this.leftChild == null) ? "X-": this.leftChild.getValue() + "-";
		output += value + "-";
		output += (this.rightChild == null) ? "X\n": this.rightChild.getValue() + "\n";
		return output;
	}
	
	/*
	 * Returns whether or not the given node has a left or right child
	 */
	public boolean hasLeftChild() {
		return this.leftChild != null;
	}
	public boolean hasRightChild() {
		return this.rightChild != null;
	}

}
