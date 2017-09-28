/*
 * BinaryTree Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a driver class for testing the BinaryTree class
 * Version  0.0.1   9/26/17
 * 			0.0.2	9/28/17		Add test methods for add() change() delete() and find() to clean up main()
 */

package classes;

public class TestBinaryTree {
	
	/*
	 * Find a node in a tree and print it to console
	 * @param tree - BinaryTree to be searched
	 * @param value - the int .value of the Node we are looking for
	 */
	private static void testFind(BinaryTree tree, int value) {
		System.out.println("Finding node " + value);
		Node foundNode = tree.find(value);
		if (foundNode == null)
			System.out.println("Unable to find node " + value + "\n");
		else
			System.out.println(foundNode);
	}
	
	/*
	 * Add a node to a BinaryTree
	 * @param tree - the BinaryTree where we want to add the node
	 * @param value - the int .value of the node we want to add
	 */
	private static void testAdd(BinaryTree tree, int value) {
		System.out.println("Adding " + value);
		tree.add(new Node(value));
		System.out.println(tree);
	}
	
	/*
	 * Delete a node from a BinaryTree and adjust tree structure
	 * @param tree - the BinaryTree containing the node to be deleted
	 * @param value - the int .value of the node we wish to delete
	 */
	private static void testDelete(BinaryTree tree, int value) {
		System.out.println("Deleting " + value);
		try {
			tree.delete(tree.find(value));
			System.out.println(tree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate node " + value + "\n");
		}
	}
	
	/*
	 * Modify a BinaryTree by changing a node from one value to another
	 * @param tree - the BinaryTree containing the node to be changed
	 * @param originalValue - the int .value of the node we want to modify
	 * @param newValue - the int .value we want the old node to assume
	 */
	private static void testChange(BinaryTree tree, int originalValue, int newValue) {
		System.out.println("Changing node " + originalValue + " to " + newValue);
		try { 
			Node changeNode = tree.find(originalValue);
			tree.change(changeNode, new Node(newValue));
			System.out.println(tree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate node " + originalValue + "\n");
		}
	}

	/* Main
	 * Build up a BinaryTree and test the various methods of the BinaryTree class
	 */
	public static void main(String[] args) {
	
		// build up the binary tree with initial nodes
		BinaryTree bTree = new BinaryTree();
		int[] nodes = new int[] {9,7,8,10,15,13,6,12,5};
		for (int i: nodes) {
			bTree.add(new Node(i));
		}
		// print to view nodes in tree
		System.out.println("Building original tree...");
		System.out.println(bTree);
		// test find() method
		testFind(bTree, 15);
		testFind(bTree, 13);
		testFind(bTree, 7);
		testFind(bTree, 99);
		// test add() method with individual nodes
		testAdd(bTree, 18);
		testAdd(bTree, 24);
		testAdd(bTree, 17);
		testAdd(bTree, 24);
		// test delete() method
		testDelete(bTree, 15);
		testDelete(bTree, 7);
		testDelete(bTree, 24);
		testDelete(bTree, 99);
		// test change() method
		testChange(bTree, 7, 16);
		testChange(bTree, 13, 17);
		testChange(bTree, 9, 11);
		testChange(bTree, 18, 15);
		testChange(bTree, 8, 7);
	}

}
