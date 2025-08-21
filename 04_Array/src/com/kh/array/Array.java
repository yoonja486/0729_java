package com.kh.array;

import java.util.Arrays;

public class Array {

	// 변수(Variable)란 ? : 메모리(RAM)공간에 DATA(VALUE)값을 저장하는 공간
	
	/*
	 *  변수의 특징
	 *  
	 *  1. 고유한 식별자를 가진다.
	 *  2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	 *  3. 자료형이 정해져있다.
	 *  4. 지역변수의 경우 메모리의 Stack영역에 올라간다.
	 *  5. **하나의 변수공간에는 하나의 값만 대입될 수 있다.**
	 *  6. 초기화를 해야만 사용이 가능하고 초기화는 한 번만 가능하다.
	 *  7. 자료형은 크기가 정해져있다.
	 *  8. 자료형끼리의 변환이 가능하다.
	 *  9. 선언된 Scope안에서만 사용이 가능하다.
	 *  10. 변수끼리 연산도 가능하다.
	 *  
	 */
	
	// ※※※※※ 중 요 함 ※※※※※
	/*
	 * 배열(Array) ? : 하나의 배열에 여러 개의 값을 담을수 있음
	 * 				 단, "같은 자료형의 값들"만 담을 수 있음
	 * 				 동종 모음(homogeneous collection)이라고도 함
	 * 				 
	 * 				 자바라는 언어 자체에 내장된 "유일"한 자료구조
	 * 
	 * 				 => 배열의 각 인덱스에 실제 값이 담김
	 * 				 	index는 '0'부터 시작한다.
	 * 
	 */
	
	
	public void method1() {
		
		// 임의의 정수를 5개를 선언하고 초기화를 진행해야지!
		/*
		int num1 = 17;
		int num2 = 2;
		int num3 = 5;
		int num4 = 33;
		int num5 = 40;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		for(int i = 1; i <= 5; i++) {
			sum += numi;
		}
		System.out.println(sum);
		*/
	
		/*
		 * 배열
		 * 
		 * 1. 배열 선언
		 * 
		 * 변수 선언 방법 -> 자료형 변수식별자;
		 * 
		 * 배열 선언 방법 ↓ 
		 * 1) 자료형 배열식별자[];
		 * 2) 자료형[] 배열식별자; --> 이 방법을 사용할 것!!!
		 * 		- 변수 이름을 지을때 뒤에 's'를 붙인다.
		 */
		
		// 변수 선언!
		// int num; 
		
		// 배열 선언!
		// int[] nums;
		
		// int[] nums = 0; <- 이렇게 넣을 수 없음
		
		/*
		 * 2. 배열 할당
		 * 
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] numbers; 			// 배열 선언
		 * numbers = new int[5]; 	// 할당
		 * 
		 * int[] arr = new int[5];	// 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 */
	
		// int[] nums = new int[2]; ([2] -> 필요한 공간수를 넣음)
		
		// nums라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int[5];
		
		/*
		 * 3. 배열의 각 인덱스에 값 대입
		 * 
		 * [ 표현법 ] 
		 * 
		 * 배열식별자[인덱스] = 값;
		 * 
		 */
		
		nums[0] = 33;
		nums[1] = 10;
		nums[2] = 25;
		nums[3] = 4;
		nums[4] = 7;
		
		// System.out.println(nums); <- 이렇게 출력하면 오류나옴
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		// System.out.println(nums[4]); <- [인덱스]까지 포함시켜야함
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += nums[i];
		}
	
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
		
	}
	
	public void methodA() {
		
		// 배열을 공부해보자
		
		// 1. 배열선언 및 할당 : []를 붙인다
		int i;
		int[] integers = new int[3];		// 0, 1, 2
		// double[] doubles = new double[2];	// 0, 1
		
		// 배열식별자.length : 배열의 크기(길이) => 정수값으로 나옴
		System.out.println(integers.length);
		// System.out.println(doubles.length);
	
		// System.out.println(i); localvariable == 초기화를 진행하지 않으면 사용할 수 없음
		
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 			=> 변수 공간에 실제 값을 바로 담을 수 있음 : (지역 = scope)변수
		 * 
		 * 참조자료형 : boolean[], char[], byte[] .... String
		 * 			=> 주소값을 담고 있는 변수 : 참조 변수(레퍼런스)
		 */
	}

	// 인포, A강의장, B강의장, C강의장, 사무실
	/*
	String[] KH정보교육원종로지원;
	KH정보교육원종로지원 = new String[5];
	System.out.println("종로점 주소 : " + KH정보교육원종로지원);
	
	KH정보교육원종로지원[0] = "인포";
	KH정보교육원종로지원[1] = "A강의장";
	KH정보교육원종로지원[2] = "B강의장";
	KH정보교육원종로지원[3] = "C강의장";
	KH정보교육원종로지원[4] = "사무실";
	*/
	// C강의장 출력
	//System.out.println(KH정보교육원종로지원[3]);
	//System.out.println(KH정보교육원종로지원[0]);
	
	
	
	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ※※ 중요함 ※※
	 * 
	 * 2. 깊은 복사
	 */
	
	public void methodF() {
		// 이게 중요함
		int[] origin = {1, 2, 3, 4, 5};
		// new int[5];
		// origin[0]  1; origin[1] = 2;....
		System.out.println(Arrays.toString(origin));
		
		// 얕은 복사로 배열을 복사
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		// 앝은 복사 => 주소값을 대입하는 것 이기 때문에 가리키고 있는 대상이 같다.
		
		System.out.println(origin.hashCode());
		System.out.println(origin.hashCode());
		
	}
	
	// 2. 깊은 복사
	public void methodG() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[6];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		*/
		
		// 배열의 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음
		
		
		// 단축키
		// alt + ↑, ↓ 		(행 이동)
		// ctrl + alt + ↑, ↓(행 복사)
		// ctrl + d			(행 삭제)
		// ctrl + / 		(행 주석처리)
		// ctrl + shift + f	(코드 정리)
		
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스
		 * attaycopy() => System클래스
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스,
		 * 					복사할 개수); // 5가지 입력함
		 * 
		 */

		System.out.println(Arrays.toString(origin));
		
		// Arrays클래스에서 제공하는 copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	
	}	
	
	
}
