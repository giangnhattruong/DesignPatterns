package com.designpattern.memento;

import java.util.LinkedList;
import java.util.List;

public class EditorHistory {
	private List<EditorState> states;
	
	public EditorHistory() {
		states = new LinkedList<>();
	}
	
	public void push(EditorState state) {
		states.add(state);
	}
	
	public EditorState pop() {
		return states.remove(states.size() - 1);
	}
}
