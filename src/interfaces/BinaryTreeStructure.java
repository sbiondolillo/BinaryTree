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

}
