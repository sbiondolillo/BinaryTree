/*
 * BinaryTreeStructure Interface
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a base interface for BinaryTree objects
 * Version  0.0.1   9/26/17
 */

package interfaces;

import java.util.ArrayList;

import classes.Node;

public interface BinaryTreeStructure {
	
	/*
	 * Getter for instance variable nodes
	 */
	ArrayList<Node> getNodes();
	
	/*
	 * Add a node to the tree
	 */
	void add(Node node);
	
	/*
	 * Modify a node in place
	 */
	void change(Node node);
	
	/*
	 * Remove a node from the tree
	 */
	void delete(Node node);
	
	/*
	 * Provide a readable format for printing to console
	 */
	String toString();
}
