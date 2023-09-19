package org.biblioteca.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many books do you want to include in your library? ");
		int booksCount = Integer.valueOf(sc.nextLine());
		
		Libro[] books = new Libro[booksCount];
		
		sc.close();
		
	}
}
