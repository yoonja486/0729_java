package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_keyboardlnput;
import com.kh.variable.Casting;

	//import을 쓰는 이유 1. 실수의 확률을 줄임 2. 효율=생산성이 떨어짐 3. 인건비가 오름

public class Run {
	
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드 호출하고 싶다.
		
		// 클래스 이름.클래스 별칭 = new 클래스이름(); 
		// 외부 패키지에 있는 클래스를 불러오고 싶을때는 = 패키지명.클래스이름을 같이 불러줘야 한다.
		
		// com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		// a.findSeasonMenu();
		// a.declareVariable();
		
		// com.kh.variable.B_keyboardlnput b = new com.kh.variable.B_keyboardlnput();
		
		//A_Variable a = new A_Variable();
		//a.findSeasonMenu();
		//B_keyboardlnput b = new B_keyboardlnput();
		//b.inputTest();
		
		Casting c = new Casting();
		//c.autoCasting();
		c.forceCasting();
		
		
	
	
	
	
		
	}

}
