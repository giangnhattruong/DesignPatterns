package com.designpattern.iteratory;

public class Main {

	public static void main(String[] args) {
		BrowseHistory history = new BrowseHistory();
		history.push("a");
		history.push("b");
		history.push("c");
		history.pop();
		
		Iterator<String> iterator = history.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.current());
			iterator.next();
		}
	}

}
