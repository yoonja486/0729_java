package com.kh.chap03.model.vo;

// 1절
/*
import java.lang.String;
import java.lane.Object;
import java.lang.System;
import java.lang.*;
*/

public class LastTime extends Object {

	// 모든 클래스의 최상위 부모클래스 => Object => 생략가능
	
	private String name;
	
	public LastTime() {
		// super();
	}
	
	public LastTime(String name) {
		// super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		// return;
	}

	/*
	 * Overriding
	 * 
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(다시씀)하는 것
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 고쳐서 사용하겠다는 의미
	 * - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출되게 됨
	 * 
	 * 오버라이딩 성립 조건!(지켜야할 규칙)
	 * 
	 * 1. 부모메소드와 메소드명 동일
	 * 2. 매개변수의 자료형, 개수, 순서가 동일(변수명과는 무관함)
	 * 3. 반환형이 동일
	 * 4. 부모메소드의 접근제한자보다 공유범위가 같거나 넓게 선언
	 * 
	 * -- 개발자들끼리의 약속
	 * 
	 * *** 오버라이딩한 메소드에는 반드시 @Override 애노테이션을 붙여주기!
	 * 
	 * @Override
	 * annotation - 일종의 주석
	 * - 생략가능
	 * - 꼭 붙이지 않더라도 부모메소드와 형태가 같으면 오버라이딩으로 판단
	 * 
	 * 왜 붙여야 하나요??
	 * 		=> 실수를 줄이자!
	 * 		=> 누가봐도 오버라이딩이라고 알아보기 쉽다
	 */
	
	@Override
	public String toString() {		// 대/소문자 체크, 매개변수, private 
		return "LastTime [name=" + name + "]";
	}

}
