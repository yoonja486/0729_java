package com.kh.operator;

import java.util.Scanner;

public class C_Compound {
	
	/*
	 * 복합 대입 연산자 : "=" 대입연산자
	 * 
	 * 다른 산술연산자와 대입연산자가 결한한 것
	 * => 자기 자신의 값과 해당 산술연산을 한 후 그 결과를 자기 자신에게 다시 대입하는 용도
	 * 가독성을 줄이고 실수를 줄이기 위해서 씀. 크게 의미를 가지고 있지 않음.
	 * 
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * 예시
	 * 
	 * int endDays = 129;
	 * 
	 * 매일 23시 59분 59초에 실행할 코드 :
	 * 
	 * endDays = endDays - 1; 
	 * ↓ -------------------- 같은 값
	 * endDays -= 1;		// 실수를 줄이기 위해서 사용함.
	 * 
	 * 
	 * System.out.println("종강일까지 " + endDays + "일 남았습니다.");
	 * 
	 */

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 하나만 입력해주세요 > ");
		int number = sc.nextInt();
		System.out.println(number);
		
		// 사용자가 입력한 정수 값은 알 수 없음
		// 사용자가 입력한 값에서 10을 뺀 값을 출력
		
		number = number - 10;
		System.out.println("10을 감소시킨 정수 값 : " + number);
		
		// 복합대입 연산자를 이용하면
		number -= 10;
		System.out.println("20을 감소시킨 정수 값 : " + number);
		
		
		
		
		
	}
	
	
	
	
	
	

}
