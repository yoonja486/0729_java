package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		Member member = new Member();
		System.out.println(member.info());
		// 객체 생성 객체 초기상태;

		Member member2 = new Member("하하호호");

		Member member3 = new Member("userId", "1234");
		System.out.println(member3.info());

		Member member4 = new Member("user02", "pass02", "홍길동");
		System.out.println(member4.info());

	}
}
