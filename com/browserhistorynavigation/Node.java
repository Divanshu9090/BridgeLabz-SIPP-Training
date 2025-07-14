package com.browserhistorynavigation;

class Node {
	Node nextUrl;
	Node prevUrl;
	private String url;
	private String data;

	public Node(String url, String data) {
		this.url = url;
		this.data = data;
	}

	public String getUrl() {
		return url;
	}

	public String getData() {
		return data;
	}
}
