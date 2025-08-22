package com.kh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import com.kh.book.Book;

public class BookController {

	private List<Book> bookList = new ArrayList();
	
	public BookController() {
		
		{
			bookList.add(new Book("자바의 정석", "남궁 성", "기타", 27000));
			bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
			bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
			bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
		}
		
	}
	
	public void insertBook(Book bk) {
		
		//System.out.println("뷰에서 만든 북 : " + bk);
		//Book book = new Book();
		//System.out.println("콘트롤라에서 만든 북 : " + book);
		bookList.add(bk);
	}
	
	public List<Book> selectList() {
		
		return bookList;
	
	}
	
	public void searchBook(String keyword) {
		
	}

	public void deleteBook(String title, String author) {
		
		
	}
	
	public void ascBook() {
		
	}
	
	
	













}

	
