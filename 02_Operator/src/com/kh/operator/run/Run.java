package com.kh.operator.run;

// 1절 import절 작성하기!
import com.kh.operator.A_Arithmetic;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalNagation;
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;

// import 패키지경로.클래스명; (패키지경로는 내가 출력하고자 하는 클래스 맨 위에 있음)
// 이 클래스를 만든 이유 : 프로그램 실행하려고
public class Run {

	public static void main(String[] args) {
		
		// method();
		// 2절 import해온 클래스에다가 별칭 붙이고 new(생성) 해주기
		//A_Arithmetic a = new A_Arithmetic();
		//a.method();
		A_Arithmetic a = new A_Arithmetic();
		//a.presentToStudent();
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		C_Compound c = new C_Compound();
		//c.method1();
		D_LogicalNagation d = new D_LogicalNagation();
		//d.method1();
		E_Comparison e = new E_Comparison();
		//e.method1();
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		g.friday();
		
		
		
		
	}
}
