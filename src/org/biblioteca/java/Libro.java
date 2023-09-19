package org.biblioteca.java;

public class Libro {
	
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
	public Libro(String title, int pages, String author, String publisher) throws Exception {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}
	
	//GETTER
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	//SETTER
	public void setTitle(String title) throws Exception {
		
		if (title.isBlank())
			throw new Exception("title can't be empty");
		
		this.title = title;
	}
	
	public void setPages(int pages) throws Exception {
		
		if (pages <= 0)
			throw new Exception("book's pages can't be 0 or less");
		
		this.pages = pages;
	}
	
	public void setAuthor(String author) throws Exception {
		
		if (author.isBlank())
			throw new Exception("author can't be empty");
		
		this.author = author;
	}
	
	public void setPublisher(String publisher) throws Exception {
		
		if (publisher.isBlank())
			throw new Exception("title can't be empty");
		
		this.publisher = publisher;
	}
	
	
	@Override
	public String toString() {
		
		return "title: " + title +
				" | pages: " + pages +
				" | author: " + author +
				" | publisher: " + publisher;
	}
}
