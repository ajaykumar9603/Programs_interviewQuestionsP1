package com.javaprograms.questions;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String ");
		String name = sc.nextLine();
		System.out.println("hello"+name);

		System.out.println("Enter AGE  ");

		int age = sc.nextInt();
		System.out.println("Age is "+age);
		sc.close();

	}

}
