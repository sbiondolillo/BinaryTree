/*
 * BinaryTree Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a driver class for testing the BinaryTree class
 * Version  0.0.1   9/26/17
 */

package classes;

public class TestBinaryTree {
	
	private static void testFind(BinaryTree tree, int value) {
		System.out.println("Finding node " + value);
		Node foundNode = tree.find(value);
		if (foundNode == null)
			System.out.println("Unable to find node " + value + "\n");
		else
			System.out.println(foundNode);
	}
	
	private static void testAdd(BinaryTree tree, int value) {
		System.out.println("Adding " + value);
		tree.add(new Node(value));
		System.out.println(tree);
	}
	
	private static void testDelete(BinaryTree tree, int value) {
		System.out.println("Deleting " + value);
		try {
			tree.delete(tree.find(value));
			System.out.println(tree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate " + value + "\n");
		}
	}

	public static void main(String[] args) {
	
		// build up the binary tree with dummy nodes
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
		testAdd(bTree, 28);
		testAdd(bTree, 24);
		// test delete() method
		testDelete(bTree, 15);
		testDelete(bTree, 7);
		testDelete(bTree, 24);
		testDelete(bTree, 99);
		// test change() method
		Node changeNode = bTree.getNodes().get(4);
		int changeValue = 16;
		System.out.println("Changing Node#" + bTree.getNodes().indexOf(changeNode) + "(" + changeNode.getValue() + ") to " + changeValue);
		bTree.change(changeNode, new Node(changeValue));
		System.out.println("Root at Node #" + bTree.getNodes().indexOf(bTree.getRoot()));
		System.out.println(bTree);
		changeNode = bTree.getNodes().get(3);
		changeValue = 17;
		System.out.println("Changing Node#" + bTree.getNodes().indexOf(changeNode) + "(" + changeNode.getValue() + ") to " + changeValue);
		bTree.change(changeNode, new Node(changeValue));
		System.out.println("Root at Node #" + bTree.getNodes().indexOf(bTree.getRoot()));
		System.out.println(bTree);
		changeNode = bTree.getNodes().get(0);
		changeValue = 11;
		System.out.println("Changing Node#" + bTree.getNodes().indexOf(changeNode) + "(" + changeNode.getValue() + ") to " + changeValue);
		bTree.change(changeNode, new Node(changeValue));
		System.out.println("Root at Node #" + bTree.getNodes().indexOf(bTree.getRoot()));
		System.out.println(bTree);
		changeNode = bTree.getNodes().get(1);
		changeValue = 7;
		System.out.println("Changing Node#" + bTree.getNodes().indexOf(changeNode) + "(" + changeNode.getValue() + ") to " + changeValue);
		bTree.change(changeNode, new Node(changeValue));
		System.out.println("Root at Node #" + bTree.getNodes().indexOf(bTree.getRoot()));
		System.out.println(bTree);
		changeNode = bTree.getNodes().get(5);
		changeValue = 15;
		System.out.println("Changing Node#" + bTree.getNodes().indexOf(changeNode) + "(" + changeNode.getValue() + ") to " + changeValue);
		bTree.change(changeNode, new Node(changeValue));
		System.out.println("Root at Node #" + bTree.getNodes().indexOf(bTree.getRoot()));
		System.out.println(bTree);
		
	}

}
