package com.designpattern.memento;

public class Editor {
	private String content;
	
	public EditorState createState() {
		return new EditorState(content);
	}
	
	public void restore(EditorState state) {
		if (state == null) {
			content = null;
		} else {
			content = state.getContent();
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
