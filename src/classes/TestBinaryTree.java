/*
 * BinaryTree Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a driver class for testing the BinaryTree class
 * Version  0.0.1   9/26/17
 */

package classes;

public class TestBinaryTree {

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
		// test add() method with individual nodes
		Node n1 = new Node(18);
		bTree.add(n1);
		System.out.println("Adding 18");
		System.out.println(bTree);
		System.out.println("Adding 24");
		bTree.add(new Node(24));
		System.out.println("Adding 28");
		bTree.add(new Node(28));
		System.out.println("Adding 20");
		bTree.add(new Node(20));
		System.out.println(bTree);
		// test delete() method
		int deletedValue = 15;
		System.out.println("Deleting " + deletedValue);
		try {
			bTree.delete(bTree.find(deletedValue));
			System.out.println(bTree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate " + deletedValue);
		}
		System.out.println("Deleting " + deletedValue);
		try {
			bTree.delete(bTree.find(deletedValue));
			System.out.println(bTree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate " + deletedValue);
		}
		deletedValue = 7;
		System.out.println("Deleting " + deletedValue);
		try {
			bTree.delete(bTree.find(deletedValue));
			System.out.println(bTree);
		}
		catch (NullPointerException e) {
			System.out.println("Unable to locate " + deletedValue);
		}
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
