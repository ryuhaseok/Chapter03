package com.javaex.ex05;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	//왜 안됨
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		boolean result;
		if(width*height == r.width*r.height) {
			result = true;
		} else {
			result = false;
		}
		return result
	}
	
}
