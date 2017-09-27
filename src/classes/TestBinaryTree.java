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
		int deletedIndex = 4;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 1;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 7;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 9;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 7;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 7;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 5;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 0;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 1;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
		deletedIndex = 2;
		System.out.println("Deleting " + bTree.getNodes().get(deletedIndex).getValue());
		bTree.delete(bTree.getNodes().get(deletedIndex));
		System.out.println(bTree);
	}

}
