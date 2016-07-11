package com.narcis.git;

public class MathOperations {
	int x;
	int y;
	
	public MathOperations(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void add() {
		int sum = this.x + this.y;
		System.out.println("Sum of " + x + " and " + y + " is: " + sum);
	}
}
