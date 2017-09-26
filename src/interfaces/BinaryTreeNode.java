/*
 * BinaryTreeNode Interface
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a base interface for Nodes used in BinaryTree objects
 * Version  0.0.1   9/26/17
 */

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
