package com.designpattern.iteratory;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	private String[] urls;
	private int size;

	public BrowseHistory() {
		this.urls = new String[10];
	}

	public void push(String url) {
		if (size >= 10) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		urls[size++] = url;
	}
	
	public String pop() {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return urls[--size] = null;
	}
	
	public Iterator<String> createIterator() {
		return new ArrayIterator(this);
	}
 	
	public class ArrayIterator implements Iterator<String> {
		private BrowseHistory history;
		private int index;
		
		public ArrayIterator(BrowseHistory history) {
			this.history = history;
		}

		@Override
		public String current() {
			return history.urls[index];
		}

		@Override
		public void next() {
			index++;
		}

		@Override
		public boolean hasNext() {
			return index < history.size;
		}
		
	}
}
