/*
 * BinaryTree Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a driver class for testing the BinaryTree class
 * Version  0.0.1   9/26/17
 */

package classes;

import java.util.Arrays;

public class TestBinaryTree {

	public static void main(String[] args) {
		
		Node n1 = new Node(8);
		Node n2 = new Node(7);
		Node n3 = new Node(9);
		n1.setLeftChild(n2);
		n2.setParent(n1);
		n1.setRightChild(n3);
		n3.setParent(n1);
		BinaryTree bTree = new BinaryTree();
		bTree.add(n1);
		bTree.add(n2);
		bTree.add(n3);
		System.out.println(bTree);
	}

}
