/*
 * BinaryTree Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement the Binary Tree structure and necessary modifications
 * Version  0.0.1   9/26/17
 */

package classes;

import java.util.ArrayList;

import interfaces.BinaryTreeStructure;

public class BinaryTree implements BinaryTreeStructure{
	
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	/*
	 * Getter for instance variable nodes
	 */
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	
	/*
	 * Add a node to the tree
	 */
	public void add(Node node) {
		nodes.add(node);
	}
	
	/*
	 * Modify a node in place
	 */
	public void change(Node node) {
		// TODO - implement this method
	}
	
	/*
	 * Remove a node from the tree
	 */
	public void delete(Node node) {
		// TODO - implement this method
	}

	/*
	 * Provide a readable format for printing BinaryTrees
	 */
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < nodes.size(); i++) {
			output += "Node #" + i + "\n";
			output += nodes.get(i);
			output += "\n";
		}
		return output;
	}
}
