package com.designpattern.memento;

public class Main {

	public static void main(String[] args) {
		Editor editor = new Editor();
		EditorHistory history = new EditorHistory();
		
		editor.setContent("a");
		history.push(editor.createState());
		
		editor.setContent("b");
		history.push(editor.createState());
		
		editor.setContent("c");
		history.push(editor.createState());
		
		EditorState lastState1 = history.pop();
		EditorState lastState2 = history.pop();
		EditorState lastState3 = history.pop();
		EditorState lastState4 = history.pop();
		editor.restore(lastState3);
		
		System.out.println(editor.getContent());
	}

}
