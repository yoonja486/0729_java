package com.kh.menu;

import java.util.List;
import java.util.Scanner;

import com.kh.book.Book;
import com.kh.controller.BookController;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		System.out.println();
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : >> ");
			int numNo = sc.nextInt();
			sc.nextLine();
			
			switch(numNo) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			
			}
		}
	}
	
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("📖 책 정보를 입력해주세요 📖");
		System.out.println("◎ 도 서 명");
		String title = sc.nextLine();
		System.out.println("◎ 저 자 명");
		String author = sc.nextLine();
		System.out.println("◎ 장   르->(1.인문 2.자연과학 3.의료 4.기타)");
		int category = sc.nextInt();
	
		// 1번 인문
		// 2번 자연과학
		// 3번 의료
		// 4번 기타
		String cate = "";		// 조건문 밖에 변수로 선언한다음 조건문 선언
		if(category == 1) {
			cate = "인문";
		} else if(category == 2) {
			cate = "자연과학";
		} else if(category == 3) {
			cate = "의료";
		} else {
			cate = "기타";
		}
		
		System.out.println("◎ 가   격");
		int price = sc.nextInt();		// nextInt()를 쓰고 그 다음줄에 nextLine() 만들어야함
		sc.nextLine();
		
		Book book = new Book(title, author, cate, price);
		bc.insertBook(book);
	}
	
	public void selectList() {
		
		List<Book> bookList = bc.selectList();

		if(bookList == null) {
			System.out.println("존재하는 도서가 없습니다");
		} else {
			for(Book bk : bookList) {
				System.out.println("===== 도서 전체 조회 =====");
				System.out.println("(" + bk.getTitle() + "/" + bk.getAuthor() + "/" + bk.getCategory() + "/" + bk.getPrice() + ")");
			} 
		}		
	}
	
	public void searchBook() {
		
	}
	
	public void deleteBook() {
		
		System.out.println("===== 도서 삭제 =====");
		System.out.println("◎ 삭제할 도 서 명");
		String title = sc.nextLine();
		System.out.println("◎ 삭제할 저 자 명");
		String author = sc.nextLine();
		
		bc.deleteBook(title, author);
		
		
	}
	
	public void ascBook() {
		
	}
	
	
}
