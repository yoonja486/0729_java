package com.kh.menu;

import java.util.List;
import java.util.Scanner;

import com.kh.book.Book;
import com.kh.controller.BookController;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		// 사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
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
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
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
		System.out.println("◎ 가   격");
		int price = sc.nextInt();
		
	}
	
	public void selectList() {
		
	
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
