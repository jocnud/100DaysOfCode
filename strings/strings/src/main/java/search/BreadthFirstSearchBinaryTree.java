package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchBinaryTree {

	public static void main(String[] args) {

		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		Node i = new Node("i");
		Node j = new Node("j");
		Node k = new Node("k");
		Node l = new Node("l");

		f.setLeft(d);
		f.setRight(k);

		d.setLeft(b);
		d.setRight(e);

		b.setLeft(a);
		b.setRight(c);

		k.setLeft(g);
		k.setRight(l);

		g.setLeft(h);
		h.setRight(j);
		j.setLeft(i);

		Queue<Node> queue = new LinkedList<Node>();
		f.setVisited(true);
		queue.add(f);

		while (!queue.isEmpty()) {

			Node currentNode = queue.remove();
			System.out.print(currentNode.getData() + " -> ");

			if (currentNode.getLeft() != null && !currentNode.getLeft().isVisited())
				queue.add(currentNode.getLeft());

			if (currentNode.getRight() != null && !currentNode.getRight().isVisited())
				queue.add(currentNode.getRight());

		}

	}

}

class Node {

	private String data;
	private Node left;
	private Node right;
	private boolean visited;

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node(String data) {
		super();
		this.data = data;
	}

}