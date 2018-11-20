package com.Calculator.labc;
import java.util.*;

public class Test extends Gui {
	private static Stack<Double> stack = new Stack<Double>();
	//i permite que el programa funcione correctamente
	private int i=0;
	private String input="";
	private double A=0,B=0,C=0;
	private double a = 0;
	private Scanner sn = new Scanner(System.in);
	
	public void ops() {
		while(!input.equals("x")) {
			//Si la entrada es de tipo double ejecuta el try statement 
			//si es de tipo String ejecuta el catch statement
			try {
				input=sn.next();
				stack.push(Double.valueOf(input));
				printCalculator(stack.get(stack.size()-1).toString());
			}catch(Exception e) {
				if(input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")||input.equals("c")||input.equals("omg")
				||input.equals("$")||input.equals("^")||input.equals("zelda")) {
					//Se utiliza un contador para sumar todo lo que pueda
					//introducir el usuario
					if (input.equals("+")) {
						while(stack.size()>i) {
							a+=stack.pop();						
						}
						printCalculator(String.valueOf(a));
						stack.push(a);
					}
					else if(input.equals("-")) {
						if (stack.size()<2) {
							printCalculator("                     Syntax error                     |   |");
						}
						else {
							try{
								a=stack.remove(i-1);
								while(stack.size()>i-1) {
									a=a-stack.pop();
							    }
							}catch(Exception o) {
								a=stack.remove(0);
								while(stack.size()>i) {
									a=a-stack.pop();
							    }
							}
							printCalculator(String.valueOf(a));
							stack.push(a);
				       }
					}	
					else if(input.equals("*")) {
						if(stack.size()<2) {
							printCalculator("                     Syntax error                     |   |");
						}
						else {
							while(stack.size()>i) {
								a=stack.pop()*stack.pop();
						   }
						}
						printCalculator(String.valueOf(a));
						stack.push(a);
					}
					else if(input.equals("/")) {
						if(stack.size()<2) {
							printCalculator("                     Syntax error                     |   |");
						}
						else {
							while(stack.size()>i) {
								double d,g;
								d=stack.pop();g=stack.pop();
								a=g/d;
							}
							printCalculator(String.valueOf(a));
						}
						stack.push(a);
					}
					else if(input.equals("^")) {
						double d,g;
						if(stack.size()<2) {
							printCalculator("                     Syntax error                     |   |");
							
						}
						else {
							g=stack.pop();d=stack.pop();
							a=Math.pow(d,g);
							printCalculator(String.valueOf(a));
							
						}
						stack.push(a);
					}
					else if(input.equals("$")) {
						i=stack.size();
						a=Math.sqrt(stack.get(i-1));
						printCalculator(String.valueOf(a));
						stack.push(a);
					}
					else if(input.equals("c")) {
						while(!stack.empty()) {
							stack.pop();
							a=0;
							printCalculator("                      CLEARED!                        |   |");
						}
					}
					else if(input.equals("omg")) {
						printCalculator("            You've found an easter egg c:             |   |");
						while(!stack.empty()) {
							stack.pop();
							a=0;
						}
					}
					else if (input.equals("zelda")) {
					    zelda();
						while(!stack.empty()) {
							stack.pop();
							a=0;
						}
					}
					i=stack.size();
				}
				//Operaciones para el manejo de variables en la memoria de la calculadora
				else if (input.equals("A")||input.equals("B")||input.equals("C")
						||input.equals("cA")||input.equals("cB")||input.equals("cC")) {
					if(input.equals("A")) {
					    if(A==0) {
					    	i=stack.size()-1;
							A=stack.get(i);
							printCalculator("A-->"+A);
							i=stack.size();
					    }
					    else {
					    	stack.push(A);
					    	printCalculator(stack.get(stack.size()-1).toString());
					    }
					}
					else if(input.equals("B")) {
						if(B==0) {
							i=stack.size()-1;
							B=stack.get(i);
							printCalculator("B-->"+B);
							i=stack.size();
						}
						else {
							stack.push(B);
							printCalculator(stack.get(stack.size()-1).toString());
						}
					}
					else if(input.equals("C")) {
						if(C==0) {
							i=stack.size()-1;
							C=stack.get(i);
							printCalculator("C-->"+C);
							i=stack.size();
						}
						else {
							stack.push(C);
							printCalculator(stack.get(stack.size()-1).toString());
						}
					}
					//Borra el valor de las variables para poder asignarle uno nuevo
					else if(input.equals("cA")) {
						A=0;
						printCalculator("A-->"+A);
					}
					else if(input.equals("cB")) {
						B=0;
						printCalculator("B-->"+B);
					}
					else if(input.equals("cC")) {
						C=0;
						printCalculator("C-->"+C);
					}
				}
				else if(!input.equals("x")) {
					printCalculator("                     Syntax error                     |   |");
				}
				//Se coloca el resultado de la operacion encima 
				//de la pila
				//stack.push(a);
			}

		}
		printCalculator("      Thank you for using my RPN calculator! :3       |   |");
	}
	
	
	public String toString(){
		return "";
	}
}
