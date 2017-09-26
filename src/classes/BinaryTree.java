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
	private Node root = null;
	
	/*
	 * Getter for instance variable nodes
	 */
	@Override
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	
	/*
	 * Add a node to the tree
	 */
	@Override
	public void add(Node node) {
		// if there isn't a root node yet, add the node and set it as root
		if (nodes.size() == 0) {
			nodes.add(node);
			root = node;
		} 
		// if there is a root node, figure out where this node goes
		else {
			Node currentNode = root;
			// traverse the tree making comparisons
			while (true) {
				// greater than
				if (node.getValue() > currentNode.getValue()) {
					// if there is an existing right child, move the pointer
					if (currentNode.getRightChild() != null) {
						currentNode = currentNode.getRightChild();
					} 
					// set this node as the right child
					else {
						currentNode.setRightChild(node);
						nodes.add(node);
						break;
					}
				}
				// less than
				else if (node.getValue() < currentNode.getValue()) {
					if (currentNode.getLeftChild() != null) {
						currentNode = currentNode.getLeftChild();
					} 
					// set this node as the left child
					else {
						currentNode.setLeftChild(node);
						nodes.add(node);
						break;
					}
				}
				// equal
				else {
					// do nothing, we don't want duplicates
					break;
				}
			}
		}
	}
	
	/*
	 * Modify a node in place
	 */
	@Override
	public void change(Node node) {
		// TODO - implement this method
	}
	
	/*
	 * Remove a node from the tree
	 */
	@Override
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
