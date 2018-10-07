package com.Calculator.labc;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		String x;
		Gui gui = new Gui();
		Scanner sn = new Scanner(System.in);
		System.out.println("Welcome to the RPN calulator by LeoB");
		System.out.println("Press y to continue...");
		System.out.println("Press x to close");
		x=sn.nextLine();
		while(x !="x") {
			gui.select();
		}
	}
}
