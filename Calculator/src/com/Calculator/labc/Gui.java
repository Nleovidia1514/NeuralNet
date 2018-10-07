package com.Calculator.labc;
import java.util.*;

public class Gui {
	int a;
	public void select() {
		Scanner sn = new Scanner(System.in);
		Operations ops = new Operations();
		System.out.println("¿Que desea hacer?");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Dividir");
		System.out.println("4.Multiplicar");
		System.out.println("5.Potencia");
		System.out.println("6.Raiz cuadrada");
		switch(sn.nextInt()) {
		case 1:
			System.out.println("ingrese los numeros a sumar:");
			ops.add(sn.nextDouble(),sn.nextDouble());
			break;
		case 2:
			System.out.println("Ingrese los numeros a restar:");
			ops.resta(sn.nextDouble(), sn.nextDouble());
			break;
		case 3:
			System.out.println("Ingrese los numeros a dividir:");
			ops.div(sn.nextDouble(), sn.nextDouble());
			break;
		case 4:
			System.out.println("Ingrese los numeros a multiplicar:");
			ops.times(sn.nextDouble(), sn.nextDouble());
			break;
		case 5:
			System.out.println("Ingrese los numeros a calcular potencia:");
			ops.pow(sn.nextDouble(), sn.nextDouble());
			break;
		case 6:
			System.out.println("Ingrese el numero a calcular raiz cuadrada:");
			ops.sqrt(sn.nextDouble());
			break;
		default:
			System.out.println("Por favor ingrese una opcion valida");
			break;
		}
		
	
	}

}
