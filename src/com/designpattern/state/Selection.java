package com.designpattern.state;

public class Selection extends Tool {

	@Override
	public void mouseDown() {
		System.out.println("Selection icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw a selection dashed box");
	}

}
