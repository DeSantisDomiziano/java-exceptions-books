package org.biblioteca.java;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many books do you want to include in your library? ");
		int booksCount = Integer.valueOf(sc.nextLine());
		
		Libro[] books = new Libro[booksCount];
		
		for(int i = 0; i < booksCount; i ++) {
			
			try {
				System.out.print("Book's title: ");
				String title = sc.nextLine();
				
				System.out.print("Book's pages: ");
				int pages = Integer.valueOf(sc.nextLine());
				
				System.out.print("Book's author: ");
				String author = sc.nextLine();
				
				System.out.print("Book's publisher: ");
				String publisher = sc.nextLine();
				
				books[i] = new Libro(title, pages, author, publisher);
				System.out.println(books[i]);
				System.out.println(i + 1 + 
									"° book filled in correctly" +
									"\n-------------------\n");
			} catch (Exception e) {
				
				System.err.println("Invalid book: " + e.getMessage());
				i--;
			}
		}
		sc.close();
		
	}
}
