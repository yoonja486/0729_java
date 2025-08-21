package com.kh.chap06.run;

import java.util.Arrays;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingConterller;

public class Run {

	public static void main(String[] args) {
		
		// Human human = new Human();

		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(5, 6);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println();
		*/
	
		MethodController mc = new MethodController();
		// int[] dd = new int[3];
		// mc.method1();
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		// System.out.println(mc.method2());
		// mc.println("method3 호출 결과 : " + mc.method3());
	
		// String parameter = "method3 호출 결과 : " + mc.method3();
		// mc.method4(2);
		
		// int result = mc.method5(5);
		// System.out.println(result);
		// mc.a(); 		- StackOverflowError(더이상 공간이 없어!)
	
		// MethodController mc = mc;
		// mc.test(mc);		- 다른 변수가 같은 주소값을 가르킬 때 => 얕은복사!!
		// ★★★★★★★★★★★★★★★★★★★★★★ 아주 중요 ★★★★★★★★★★★★★★★★★★★★★
	
		// 복습하자~~~!!!
		
		// 객체를 생성하지 않고 메소드를 호출 할 수 있음
		Math.random();
		int[] arr = {2, 3};
		// System.out.println(Arrays.toString(arr));
	
		// MethodController.staticMethod();
		
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		System.out.println();
		*/
	
	
		OverloadingConterller oc = new OverloadingConterller();
		
		// 정적 바인딩(Static Binding) : 호출과 실행을 하나로 묶어준다.
		// 컴파일이 끝난 시점에 어떤 메소드가 호출될지 결정함
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출 연결함
		oc.test();
		oc.test(2); 	// 인자값을 전달해주는데 자료형을 호출한다. 라고 의미함
		oc.test("3");
		oc.test(1, 2);
		// oc.test(2, "abc");
		// oc.test(aaa, 3);
	
	
	}
	
	
}
