package com.Calculator.labc;

public class Gui{
	
	private void calcTop() {
		System.out.println("________________________________________________________________");
		System.out.println("|    RPN                                        By LeoB        |");
		System.out.println("|       CALCULATOR                                             |");
		System.out.println("|   ______________2K18______________________________________   |");
		System.out.println("|   |                                                      |   |");
	}
	
	private void calcBottom() {
		System.out.println("|   |______________________________________________________|   |");
		System.out.println("|   _______ _______ _______          _______ _______ _______   |");
		System.out.println("|   |     | |     | |     |          |     | |     | |     |   |");
		System.out.println("|   |  A  | |  B  | |  C  |          |  1  | |  2  | |  3  |   |");
		System.out.println("|   |_____| |_____| |_____|          |_____| |_____| |_____|   |");
		System.out.println("|   _______ _______         _______  _______ _______ _______   |");
		System.out.println("|   |Squar| |Pow  |         |     |  |     | |     | |     |   |");
		System.out.println("|   | root| |  ^  |         |CLEAR|  |  4  | |  5  | |  6  |   |");
		System.out.println("|   |___$_| |_____|         |_____|  |_____| |_____| |_____|   |______");
		System.out.println("|   _______ _______ _______ _______  _______ _______ _______ _______  | ");
		System.out.println("|   |     | |     | |     | |     |  |     | |     | |     | |     |  | ");
		System.out.println("|   |  +  | |  -  | |  *  | |  /  |  |  7  | |  8  | |  9  | |  0  |  | ");
		System.out.println("|   |_____| |_____| |_____| |_____|  |_____| |_____| |_____| |_____|  | ");
		System.out.println("|_____________________________________________________________________|");
		System.out.println("--->                                   ");
	}
	
	public void printCalculator(String a) {
		calcTop();
	    System.out.println("|   |"+a);
	    calcBottom();
	}
	
	protected void zelda() {
		printCalculator("Hey listen");
		
	}

}
