package classes;

import interfaces.BinaryTreeNode;

public class Node implements BinaryTreeNode {
	
	private Node parent;
	private Node leftChild;
	private Node rightChild;
	
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
