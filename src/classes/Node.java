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
	
	private Node parent;
	private Node leftChild;
	private Node rightChild;
	
	/*
	 * Getters and setters for instance variables
	 */
	@Override
	public Node getParent() {
		return parent;
	}
	@Override 
	public void setParent(Node node) {
		parent = node;
	}
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

}
