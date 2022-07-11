package com.designpattern.iteratory;

public interface Iterator<T> {
	T current();
	void next();
	boolean hasNext();
}
