package com.designpattern.state;

public class Brush extends Tool {

	@Override
	public void mouseDown() {
		System.out.println("Brush icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw a brush line");
	}

}
