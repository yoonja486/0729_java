package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.book.Book;

public class BookController {

	private List<Book> booksList = new ArrayList();
	
	public BookController() {
		
		{
			booksList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
			booksList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
			booksList.add(new Book("대화의 기술", "강보람", "인문", 17500));
			booksList.add(new Book("암 정복기", "박신우", "의료", 21000));
		}
		
	}
	
	public void insertBook() {
		
	}
	
	public void selectList() {
		
	}
	
	public void searchBook(String keyword) {
		
	}

	public void deleteBook(String title, String author) {
		
		
	}
	
	public void ascBook() {
		
	}
	
	
	













}

	
