package com.browserhistorynavigation;

public class Main {
	public static void main(String[] args) {
		History h = new History();

		// Adding URLs to the history
		h.addEnd("url1", "data1");
		h.addEnd("url2", "data2");
		h.addEnd("url3", "data3");
		h.addEnd("url4", "data4");
		h.addEnd("url5", "data5");

		// Going through the history
		h.backHistory();
		h.backHistory();
		System.out.println();

		// Showing previous history
		h.prevHistory();
		System.out.println();

		// Showing upcoming history
		h.upcomingHistory();
		System.out.println();

		// Searching for specific URLs in the prev history
		h.backHistory("url2");
		System.out.println();

		// Searching for specific URLs in the next history
		h.nextHistory();
		System.out.println();

		// Going back to a specific URL in Upcoming history
		h.nextHistory("url4");
	}
}
