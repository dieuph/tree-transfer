package com.github.dieuph.treetransfer;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Node {

	String value;
	Node left;
	Node right;

	public Node(String value) {
		super();
		this.value = value;
		int length = value.length() / 2;		

		if (length != 0) {
			left = new Node(value.substring(0, length));
			right = new Node(value.substring(length));
		}
	}

	public static void trans(Node root, Object obj) throws IllegalAccessException {
		try {
			Queue<Node> currentLevel = new LinkedList<Node>();
			Queue<Node> nextLevel = new LinkedList<Node>();

			currentLevel.add(root);

			// get object class
			Class<?> clazz = Class.forName(obj.getClass().getCanonicalName());

			// get class properties
			Field[] fields = clazz.getDeclaredFields();

			Field field = null;
			Node currentNode = null;
			int index = 0;

			// loop in level
			while (!currentLevel.isEmpty()) {
				Iterator<Node> iterator = currentLevel.iterator();
				index = 0;
				
				// loop in childs
				while (iterator.hasNext()) {
					currentNode = iterator.next();
					
					if (currentNode.left != null) {
						nextLevel.add(currentNode.left);
					}
					if (currentNode.right != null) {
						nextLevel.add(currentNode.right);
					}
					
					if (currentLevel.size() == fields.length) {
						field = fields[index++];
						field.setAccessible(true);
						field.set(obj, currentNode.value);
					}
				}

				currentLevel = nextLevel;
				nextLevel = new LinkedList<Node>();
			}

		} catch (SecurityException | ClassNotFoundException
				| IllegalArgumentException e) {
			e.printStackTrace();
		}

	}
}
