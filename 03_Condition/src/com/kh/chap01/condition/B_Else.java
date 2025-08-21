package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if ~ else
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과가 true였을 때 실행할 코드		- a
	 * } else {
	 * 		조건식의 결과가 false였을 때 실행할 코드		- b
	 * }
	 *  
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 * 
	 */
	
	public void method1() {
		
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 주세요 > ");
		int num = sc.nextInt();
		// System.out.println(num);
		
		//		num > 0
		if(num > 0) {
			System.out.println("입력값이 0보다 큽니다!");
		} else {
			System.out.println("입력값이 0보다 크지 않습니다.!");
		}
		
		/* if(!num > 0)) {
		 * System.out.println("입력값이 0보다 크지 않아요!");
		 * }
		 * if 조건문을 한번 더 쓰지 않고 else을 이용해서 사용할 수 있음.(else 단독으로 나올수 없음)
		 * 
		 * if문의 조건식의 결과가 true일 경우 => else블럭을 건너 뜀
		 * 불필요한 연산이 줄어듬 => 처리속도가 향상
		 * 
		 */
		
		/* if ~ else if 문
		 * 
		 * [ 표현법 ]
		 * 
		 * if(조건식1) {
		 * 		조건식 1이 true일 경우 실행할 코드
		 * } else if(조건식2) {
		 * 		조건식이 2가 true일 경우 실행할 코드
		 * } else if(조건식3) {
		 * 		조건식이 3이 true일 경우 실행할 코드
		 * } else if(조건식4) {
		 * 		조건식 4가 true일 경우 실행할 코드			- 추가하고 싶은 만큼 조건을 계속 만들수 있음
		 * } else {
		 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드 
		 * }
		 * 
		 */
	}
	
	public void method2() {
		
		// 정수를 입력받아서 0보다 큰지 / 0인지 / 0보다 작은지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 바람 > ");
		int num = sc.nextInt();
		// System.out.println(num);
		
		/*if(num > 0) System.out.println("0보다 커요~");
		 *if(num == 0) System.out.println("0이예요~");
		 * if(num < 0) System.out.println("0보다 작아요~");
		 */
		
		/*if(num == 0) {
			System.out.println("0입니다~");
		} else if(num < 0) {
			System.out.println("0보다 작습니다~");
		} else {
			System.out.println("0보다 큽니다~");
		}
		*/
		
		/*if(num > 0) {
			System.out.println("0입니다.");
		} else if(num < 0) {
			System.out.println("0보다 작습니다.");
		} else {
			System.out.println("0보다 큽니다.");
		}
		*/
	}
	
	public void ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		// 1 ~ 12  : 어린이 입니다.
		// 13 ~ 17 : 청소년 입니다.
		// 18 ~    : 성인 입니다.
		// 0, -    : 외계인 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		
		/*if((1 <= age) && (age <= 12)) {
			System.out.println("어린이 입니다.");
		} else if((13 <= age) && (age <= 17)) {
			System.out.println("청소년 입니다.");			
		} else if(18 <= age) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("올바른 값을 입력해주세요.");
		}
		*/ 
		
		if(age < 0) {
			System.out.println("올바른 나이를 일력해주세요.");
		} else if(age >= 18) {
			System.out.println("성인 입니다.");
		} else if(age <= 12) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
		
	}
	
	
	
	
	
}
