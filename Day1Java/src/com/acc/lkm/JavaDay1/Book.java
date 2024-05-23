package com.acc.lkm.JavaDay1;
 
import java.util.Scanner;
 
public class Book {
	String authName;
	int yearOfPublication;
	String title;

 
	public Book(String authName, int yearOfPublication, String title) {
		this.authName = authName;
		this.yearOfPublication = yearOfPublication;
		this.title = title;
	}
	public String details() {
		return this.authName+","+this.yearOfPublication+","+this.title;
	}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String authname = sc.nextLine();
		String title = sc.nextLine();
		int year = sc.nextInt();
		Book book = new Book(authname , year,title);
		System.out.println(book.details());
 
	}
 
}