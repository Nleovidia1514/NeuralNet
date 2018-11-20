package com.labc.Rebelion;

import java.util.Random;
import java.util.Scanner;

public class Start {
	private Tile starting;
	private Map map;
	private Random rnd = new Random();
	private String clase;
	private Scanner sn = new Scanner(System.in);
	
	public Start() {
		this.map = new Map();
		this.starting = map.getTile(rnd.nextInt(Map.MapSize), rnd.nextInt(Map.MapSize));
		System.out.println("Choose a class\nMage\nRogue\nFighter\nNerio");
		clase = sn.nextLine();
		Singleton.getInstance(starting, clase);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Start();
	}
	
}

class Singleton 
{ 
	static Tile starting;
	static String clase;
	private volatile static Singleton obj; 

	private Singleton(Tile starting, String clase) {
		Singleton.starting = starting;
		Singleton.clase = clase;
		if(clase.toLowerCase().equals("mage")) 
			new Mage(starting);
		else if(clase.toLowerCase().equals("rogue"))
			new Rogue(starting);
		else if(clase.toLowerCase().equals("fighter"))
			new Fighter(starting);
		else if(clase.toLowerCase().equals("nerio"))
			new Nerio(starting);
		else
			System.out.println("That is not a valid class");
		} 

	public static Singleton getInstance(Tile starting, String clase) 
	{ 
		if (obj == null) 
		{ 
			synchronized (Singleton.class) 
			{ 
				if (obj==null) 
					obj = new Singleton(starting, clase); 
			} 
		} 
		return obj; 
	} 
} 
