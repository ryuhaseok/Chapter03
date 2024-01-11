package com.javaex.ex03;

import java.util.Objects;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	//Object의 equals메소드를 재정의(자료형 똑같아야함)
	@Override
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		boolean result;
		if (this.x == p.x && this.y == p.y) {
			result = true;
	} else {
		result = false;
	}
		return result;
	}
	
}
