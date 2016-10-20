package com.github.dieuph.treetransfer;

public class TreeTrans {
	public static void main(String[] args) throws IllegalAccessException {
		System.out.println("RUN BARRY RUN");

		Node node = new Node("ABCDEFGH");

		Subject1 subject1 = new Subject1();
		Subject2 subject2 = new Subject2();
		Subject3 subject3 = new Subject3();
		Subject4 subject4 = new Subject4();

		Node.trans(node, subject1);
		Node.trans(node, subject2);
		Node.trans(node, subject3);
		Node.trans(node, subject4);

		System.out.println(subject1);
		System.out.println(subject2);
		System.out.println(subject3);
		System.out.println(subject4);
	}
}
