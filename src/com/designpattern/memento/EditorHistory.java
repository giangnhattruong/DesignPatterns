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
		int lastStateIndex = states.size() - 1;
		
		if (lastStateIndex < 0) {
			return null;
		}
		
		return states.remove(lastStateIndex);
	}
}
