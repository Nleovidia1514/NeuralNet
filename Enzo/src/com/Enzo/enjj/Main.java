package com.Enzo.enjj;
import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static String command;
    static boolean newCommand = false;

    public static void main(String[] args) {
    	Calculator calculator = new Calculator();
        Console console = System.console();
        Scanner ss = new Scanner(System.in);

        if (console == null) {
        	System.out.println("Enter your expression, or 'exit' to quit");
        	boolean keepRunning = true;
            while (keepRunning) {
                String inputString=ss.next();
                if ("exit".equals(inputString)) {
                    keepRunning = false;
                } else {
                    try {
                        calculator.eval(inputString);
                    } catch (CalculatorException e) {
                        System.out.println(e.getMessage());
                    }

                    DecimalFormat fmt = new DecimalFormat("0.##########");
                    Stack<Double> stack = calculator.getValuesStack();
                    System.out.print("Stack: ");
                    for (Double value : stack) {
                        System.out.print(fmt.format(value));
                        System.out.print(" ");
                    }
                    System.out.printf("%n");
                }
            } 
        }
        else {
        	System.err.println("No console.");
        	System.exit(1);
        }

       

       

        
    }
}

