package com.Calculator.labc;
import java.util.*;

public class Operations {
	Scanner sn=new Scanner(System.in);
	Stack<Double> stack = new Stack<>();
	
	public void add(double a,double b) {
		stack.push(a);
		stack.push(b);
		double c=stack.push(stack.pop()+stack.pop());
		System.out.println(""+a+b+"+="+c);
    }
	
	public void resta(double a, double b) {
		stack.push(a);
		stack.push(b);
		double c=stack.push(stack.pop()-stack.pop());
		System.out.println(""+a+b+"-="+c);
	}
	
	public void div(double a, double b) {
		double z = 0;
        if (b!=0) {
			z=a/b;
			stack.push(z);
			System.out.println(""+a+b+"/="+z);
		}
		else {
			System.out.print("indefinido");
		}
	}
	
	public void times(double a, double b) {
		double c=a*b;
		stack.push(c);
		System.out.println(""+a+b+"*="+c);
	}
	
	public void pow(double a, double b) {
		double c=Math.pow(a, b);
		stack.push(c);
		System.out.println(""+a+b+"^="+c);
	}
	
	public void sqrt(double a) {
		double c=Math.sqrt(a);
		stack.push(a);
		System.out.println(""+a+"2^="+c);
	}
	

}
