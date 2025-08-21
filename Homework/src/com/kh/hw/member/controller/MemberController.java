package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	// static 블럭 		- 첫번째 수행
	// static 블럭		- 정적 초기화
	static {
		
	}
	
	
	// 초기화 블럭			- 두번째 수행
	{
		m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);
	
	}
	
	public MemberController() {}
		
		// return m;
	
	public int existMemberNum() {
		
		int count = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age); 
				break;
			}
		}
	}

	public Member searchId(String id) {
		
		// 매개변수 id : 사용자가 입력한 검색하고자하는 아이디 값
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				// 아이디 똑같은거 있어요.
				return m[i];
			}
		}
		return null;
	}

	public Member[] searchName(String keyword) {
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(keyword)) {
				members[index++] = m[i];
			}
		}
		return members;
	}
	
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		
		// 전달받은 3개의 값을 가지고 비밀번호를 바꿔주거나 바꿔주지 않거나
		
		// 배열의 첫 번째 요소 아이디값 비교해야지
		for(int i = 0; i < m.length; i++) {
			if(m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPw)) {
				m[0].setPassword(newPassword);
				return true;
			}
		}
		return false;
	}

	public int deleteMember(String userId, String userPwd) {
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPwd)) {
				m[i] = null;
				return 1;
			}
		}
		return 0;
	}







}

