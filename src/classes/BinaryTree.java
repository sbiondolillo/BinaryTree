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
		if (!this.hasRoot()) {
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
					if (currentNode.hasRightChild()) {
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
					if (currentNode.hasLeftChild()) {
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
		// find the node
		Node currentNode = root;
		Node parent = root;
		int direction = -1;
		// traverse the tree stepwise, moving down one node at a time
		while (true) {
			// greater than, move right
			if (node.getValue() > currentNode.getValue()) {
				if (currentNode.hasRightChild()) {
					parent = currentNode;
					direction = 1;
					currentNode = currentNode.getRightChild();
					continue;
				}
			}
			// less than, move left
			else if (node.getValue() < currentNode.getValue()) {
				if (currentNode.hasLeftChild()) {
					parent = currentNode;
					direction = 0;
					currentNode = currentNode.getLeftChild();
					continue;
				}
			}
			// equal, we found the node
			else {
				// two children
				if (currentNode.hasLeftChild() && currentNode.hasRightChild()) {
					// remember the node so we can delete it later
					// keep the children stored off so we can swap in a new parent
					Node deletedNode = currentNode;
					Node leftBranchHead = currentNode.getLeftChild();
					Node rightBranchHead = currentNode.getRightChild();
					// find leftmost element of right branch
					// move down one element to the right
					// see if there is a left branch from the right branch head
					if (rightBranchHead.hasLeftChild()) {
						// follow the left branch all the way down
						currentNode = rightBranchHead;
						Node branchParent = currentNode;
						while (currentNode.hasLeftChild()) {
							branchParent = currentNode;
							currentNode = currentNode.getLeftChild();
						}
						// set any stranded children in their place 
						if (currentNode.hasRightChild()) {
							branchParent.setLeftChild(currentNode.getRightChild());
						}
						// move the leftmost node up to the spot of the deleted node
						parent.setRightChild(currentNode);
						if (branchParent.equals(rightBranchHead)) {
							rightBranchHead.setLeftChild(null);
						}
						currentNode.setRightChild(rightBranchHead);
						currentNode.setLeftChild(leftBranchHead);
						// delete the chosen node
						nodes.remove(deletedNode);
						deletedNode = null;
						break;
					}
					// if there isn't a left branch off of the right branch head
					// promote the right branch head to the parent's right child
					// if we came down the right branch
					if (direction == 1) {
						parent.setRightChild(rightBranchHead);
						rightBranchHead.setLeftChild(leftBranchHead);
					} 
					// promote the right branch head to the parent's left child
					// if we came down the left branch
					else {
						parent.setLeftChild(rightBranchHead);
						rightBranchHead.setLeftChild(leftBranchHead);
					}
					// delete the chosen node
					nodes.remove(deletedNode);
					deletedNode = null;
					break;					
				}
				// one child
				else if (currentNode.hasLeftChild() || currentNode.hasRightChild()) {
					// we moved down the right branch to arrive here
					if (direction == 1) {
						// there is a left child remaining below
						if (currentNode.hasLeftChild()) {
							parent.setRightChild(currentNode.getLeftChild());
							nodes.remove(currentNode);
							currentNode = null;
						}
						// there is a right child remaining below
						else {
							parent.setRightChild(currentNode.getRightChild());
							nodes.remove(currentNode);
							currentNode = null;
						}
					}
					// we moved down the left branch to arrive here
					else if (direction == 0) {
						// there is a left child remaining below
						if (currentNode.hasLeftChild()) {
							parent.setLeftChild(currentNode.getLeftChild());
							nodes.remove(currentNode);
							currentNode = null;
						}
						// there is a right child remaining below
						else {
							parent.setLeftChild(currentNode.getRightChild());
							nodes.remove(currentNode);
							currentNode = null;
						}
					}
					// something went wrong
					else
						System.out.println("Something went wrong.");
						break;
				}
				// no children
				else {
					// we moved down the right branch to arrive here
					if (direction == 1) {
						parent.setRightChild(null);
						nodes.remove(currentNode);
						currentNode = null;
						break;
					}
					// we moved down the left branch to arrive here
					else if (direction == 0) {
						parent.setLeftChild(null);
						nodes.remove(currentNode);
						currentNode = null;
						break;
					}
					// something went wrong
					else {
						System.out.println("Something went wrong.");
						break;
					}
				}
			}
		}
	}

	/*
	 * Provide a readable format for printing BinaryTrees
	 */
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < nodes.size(); i++) {
			output += "Node #" + i + ": ";
			output += nodes.get(i);
			output += "\n";
		}
		return output;
	}
	
	/*
	 * Returns whether or not the BinaryTree has a root node set
	 */
	private boolean hasRoot() {
		return root != null;
	}
}
