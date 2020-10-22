package com.io;

class Node{
	int d;
	Node next = null;
	Node(){}
	Node(int d){
		this.d = d;
	}
	static Node head = null;
	static Node tail = null;

	public void addNode(int d){
		Node newNode = new Node(d);
		if(head == null && tail == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void traverse() {
		if(head == null){
			System.out.println("No nodes to traverse");
			return;
		}
		Node headNode = head;
		while(headNode != null){
			System.out.print(headNode.d + " ");
			headNode = headNode.next;
		}	
	}
	
	public void reverse(){
		Node prev = null;
		Node headNode = head;
		
		while(headNode != null){
			Node next = headNode.next;
			headNode.next = prev;
			prev = headNode;
			headNode = next;
		}
		head = prev;
	}
	public boolean isPalidrome() {
		Node slow = head;
		Node fast = head;
		Node prev = null;
		
		while(fast != null & fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		while(slow != null){
			Node next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}
		
		fast = head;
		
		while(slow != null){
			if(slow.d != fast.d)
				return false;
			slow = slow.next;
			fast = fast.next;	
			}
		
		return true;
	}
}


public class LinkedList {

	public static void main(String[] args) {
		Node linkedList = new Node();
		linkedList.addNode(10);
		linkedList.addNode(20);
		linkedList.addNode(30);
		linkedList.addNode(20);
		linkedList.addNode(40);
		linkedList.traverse();
		linkedList.reverse();
		System.out.println("After reverse the list");
		linkedList.traverse();
		if(linkedList.isPalidrome())
			System.out.println("It is palidrome");
		else
			System.out.println("It is not palidrome");
	}

}
