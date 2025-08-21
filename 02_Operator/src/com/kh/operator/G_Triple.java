package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자 : 피 연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		  결과값이 true일 경우 첫번째 문장을 처리~
	 * 		  결과값이 false일 경우 두 번째 문장을 처리~
	 * 
	 * [표현법]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 */

	public void method1() {
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 더 멜론 오브 멜론 프라푸치노");
		System.out.println("2. 자몽 망고 코코 프라푸치노");
		System.out.println("3. 카페 브륄레 프라푸치노");
		
		// Ctrl + Shift + o (import 자동으로 입력하는 단축키)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "더 멜론 오브 멜론 프라푸치노를 주문하셨습니다."	
							: (menuNo == 2) ? "자몽 망고 코코 프라푸치노를 주문하셨습니다."
							: (menuNo == 3) ? "카페 브륄레 프라푸치노를 주문하셨습니다." 
							: "없는 메뉴를 주문하셨습니다.";
		// 삼항 연산자를 쓸 경우 반복적으로 조건식을 만들어야 한다.
		// 조건식 ? 조건식이 true일 경우 결과 값 : 조건식이 false일 경우 결과 값 
			//(?)도 포함해야함.
		// 선택한 번호에 따라서 메뉴명을 출력
		// 1번 입력 시 == "더 멜론 오브 멜론 프라푸치노를 주문하셨습니다."
		
		System.out.println(selectedMenu);
		
	}
	
	// 홀짝 구하기
	public void method2() {
		// 사용자에게 정수 값을 하나 입력받아서 입력받은 정수가 홀 / 짝 판별해서 출력
		// 첫. 입력도구 별칭 짓기
		Scanner sc = new Scanner(System.in);
		
		// 필요한 값을 입력받을 수 있도록 메시지 출력
		System.out.print("숫자를 입력해주세요 > ");
		
		// 정수형 변수를 선언한 뒤 스캐너의 메소드를 호출해서 입력 버퍼에 있는 정수 값을 받아와서
		// 정수형 변수 공간에 초기화를 해줌.
		
		int num = sc.nextInt();
		//System.out.println("착하게 사는법 : 변수 값 찍어보기 > " + num);
		
		// num % 2 != 0 
		// num % 2 == 1 
		// ((num % 2) == 0)		
		
		char oddEven = ((num % 2) == 0) ? '짝' : '홀';
		
		System.out.println("입력하신 " + num + "은(는) " + oddEven + "수 입니다.");
		
	}
	
	public void friday() {
		
		// 사용자에게 알파벳 한 글자를 입력받아서 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한글자만 입력해주세요. > ");
		char ch = sc.nextLine().charAt(0);
		//System.out.println(ch);
		
		// ch == 'a' ~~~ 'z' || 'A' ~~~ 'Z'
		// 'a' <= ch <= 'z' == 소문자
		
		char result = (('a' <= ch) && (ch <= 'z')) ? '소' : '대';
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력해주세요.
		System.out.println(ch + "는 " + result + "문자 입니다.");
		
		// 출력형식
		// XXX(사용자가 입력한 알파벳)은(는) 소문자/대문자 입니다.
		
	}
	
}

