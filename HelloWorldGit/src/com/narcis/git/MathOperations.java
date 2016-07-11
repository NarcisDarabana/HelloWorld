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
	
	public void multiple() {
		int multp = this.x * this.y;
		System.out.println("Multiplication of " + x + " and " + y + " is: " + multp);
	}
	
	public void substraction(){
		int substraction = this.x - this.y;
		System.out.println("The difference between " + x + " and " + y + " is: " + substraction);
	}
}
