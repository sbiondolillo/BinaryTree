/*
 * BinaryTreeNode Interface
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a base interface for Nodes used in BinaryTree objects
 * Version  0.0.1   9/26/17
 * 			0.0.2	9/27/17		Added hasLeftChild() and hasRightChild() methods
 */

package interfaces;

import classes.Node;

public interface BinaryTreeNode {
	
	/*
	 * Getters/Setters for instance variables
	 */
	Node getLeftChild();
	void setLeftChild(Node node);
	Node getRightChild();
	void setRightChild(Node node);
	int getValue();
	void setValue(int value);
	
	/*
	 * Provide a readable format for printing Nodes
	 */
	String toString();
	
	/*
	 * Returns whether or not the given node has a left or right child
	 */
	boolean hasLeftChild();
	boolean hasRightChild();
}
