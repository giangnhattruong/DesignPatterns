package com.designpattern.state;

import java.util.Scanner;

public class Main {
	private static final int SELECTION_TOOL = 1;
	private static final int BRUSH_TOOL = 2;
	private static final int EVENT_MOUSE_UP = 1;
	private static final int EVENT_MOUSE_DOWN = 2;

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Select an event:\n" +
					"1. Mouse up\n" +
					"2. Mouse down");
			int eventOption = scanner.nextInt();
			
			System.out.println("Select a tool:\n" +
					"1. Selection\n" +
					"2. Brush");
			int toolOption = scanner.nextInt();
			
			if (eventOption == EVENT_MOUSE_UP) {
				switch (toolOption) {
				case SELECTION_TOOL:
					canvas.setCurrentTool(new Selection());
					break;
				case BRUSH_TOOL:
					canvas.setCurrentTool(new Selection());
					break;
				default:
				}
				
				canvas.mouseUp();
			} else if (eventOption == EVENT_MOUSE_DOWN) {
				switch (toolOption) {
				case SELECTION_TOOL:
					canvas.setCurrentTool(new Selection());
					break;
				case BRUSH_TOOL:
					canvas.setCurrentTool(new Brush());
					break;
				default:
				}
				
				canvas.mouseDown();
			}
			

			System.out.println("Do you want to continue? Y/N: ");
			String loopOption = scanner.next();
			
			if (!loopOption.toLowerCase().equals("y")) {
				break;
			}
		}
	}

}
