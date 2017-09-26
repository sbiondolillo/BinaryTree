package interfaces;

import classes.Node;

public interface BinaryTreeNode {
	
	/*
	 * Getters/Setters for instance variables
	 */
	Node getParent();
	void setParent(Node node);
	Node getLeftChild();
	void setLeftChild(Node node);
	Node getRightChild();
	void setRightChild(Node node);
	
}
