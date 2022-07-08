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
		
		System.out.println(history);
	}

}
