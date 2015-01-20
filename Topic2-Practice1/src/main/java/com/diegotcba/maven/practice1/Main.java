package com.diegotcba.maven.practice1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Ingrese un nombre:");
		String name=input.next();
		System.out.println("Congratulations " + name + "!!!!!");
		input.close();
	}
}
