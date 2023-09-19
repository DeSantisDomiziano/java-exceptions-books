package org.biblioteca.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final String FILE_PATH = "./books.txt";
	
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
		
		FileWriter infoBookWriter = null;
		try {
			
			infoBookWriter = new FileWriter(FILE_PATH, true);
	
			for (int i = 0; i < booksCount; i++) {
				
				infoBookWriter.write(books[i].toString() + "\n");
				

			}
		} catch (IOException e) {
			
			System.err.println("Error updating file: " + e.getMessage());
		} finally {
			
			try {
				infoBookWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File tmpFile = new File(FILE_PATH);
		Scanner reader = null;
		try {
			
			reader = new Scanner(tmpFile);
			
			while (reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) { 
		
			System.err.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null)
				reader.close();
		}
		
	}
}
