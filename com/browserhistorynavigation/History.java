package com.browserhistorynavigation;

public class History extends Navigation{
	Node head;
	public void addEnd(String url,String data) {
		Node newNode = new Node(url,data);
		if(head == null) {
			head = newNode;
			return;
		}
		head.nextUrl = newNode;
		newNode.prevUrl = head;
		head = newNode;
	}
	
	public void prevHistory() {
		if(head == null || head.prevUrl == null) {
			System.out.println("No previous history available");
			return;
		}
		Node temp = head.prevUrl;
		while(temp!=null) {
			System.out.println(temp.getUrl());
			temp = temp.prevUrl;
		}
	}
	
	public void upcomingHistory() {
		if(head == null || head.nextUrl == null) {
			System.out.println("No next history available");
			return;
		}
		Node temp = head.nextUrl;
		while(temp!=null) {
			System.out.println(temp.getUrl());
			temp = temp.nextUrl;
		}
	}
	
	public void backHistory() {
		if(head == null || head.prevUrl == null) {
			System.out.println("No previous history available");
			return;
		}
		head = head.prevUrl;
		System.out.println(head.getData());
	}
	
	public void nextHistory() {
		if(head == null || head.nextUrl == null) {
			System.out.println("No previous history available");
			return;
		}
		head = head.prevUrl;
		System.out.println(head.getData());
	}
	
	public void backHistory(String url) {
		if(head == null) {
			System.out.println("No Search History");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			if(temp.getUrl()==url) {
				System.out.println(temp.getData());
				head = temp;
				return;
			}
			temp = temp.prevUrl;
		}
		System.out.println("No such url exist");
	}
	
	public void nextHistory(String url) {
		if(head == null) {
			System.out.println("No Search History");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			if(temp.getUrl()==url) {
				System.out.println(temp.getData());
				head = temp;
				return;
			}
			temp = temp.nextUrl;
		}
		System.out.println("No such url exist");
	}
	
}