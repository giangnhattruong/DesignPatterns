package com.designpattern.state;

public class Canvas {
	private Tool currentTool;

	public Canvas() {
	}
	
	public Canvas(Tool currentTool) {
		this.currentTool = currentTool;
	}

	public void mouseDown() {
		currentTool.mouseDown();
	}
	
	public void mouseUp() {
		currentTool.mouseUp();
	}
	
	public Tool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
}
