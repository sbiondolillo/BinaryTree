/*
 * BinaryTreeStructure Interface
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a base interface for BinaryTree objects
 * Version  0.0.1   9/26/17
 * 			0.0.2	9/27/17		Added getter for root instance variable
 */

package interfaces;

import java.util.ArrayList;

import classes.Node;

public interface BinaryTreeStructure {
	
	/*
	 * Getters for instance variables
	 */
	ArrayList<Node> getNodes();
	Node getRoot();
	
	/*
	 * Add a node to the tree
	 */
	void add(Node node);
	
	/*
	 * Modify a node in place
	 */
	void change(Node existingNode, Node newNode);
	
	/*
	 * Remove a node from the tree
	 */
	void delete(Node node);
	
	/*
	 * Locate a Node within the tree
	 * @param value - the int .value of the Node to be found
	 */
	Node find(int value);
	
	/*
	 * Provide a readable format for printing to console
	 */
	String toString();
}
