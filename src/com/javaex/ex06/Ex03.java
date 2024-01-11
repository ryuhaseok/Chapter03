package com.javaex.ex06;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int a = 3;  //문제 없음
		System.out.println(a); //객체가 아니라 toString이 없음
		
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3; //자동 박싱 (원래는 주소( new Intger() )를 담아야하지만 자동으로 담아준다)
		System.out.println(v01.toString());
		int v02 = i; // 자동 언박싱
		
		/*
		Integer r01 = 100;
		int result = r01.parseInt("1234567"); 
		System.out.println(result+3);
		*/
		
		//문자열을 숫자로 바꿔주는 parseInt
		int result = Integer.parseInt("12345");
		System.out.println(result+3);
		
		//숫자를 문자열로 바꿔주는
		
		/*
		String str = "안녕하세요";
		String result02 = str.valueOf(555);
		System.out.println(result02+2);// 문자열로 변환됐기때문에 555+2 = 557이 아닌 5552가 출력
		*/
		
		// static으로 올라가있기때문에 String 변수 선언으로 메모리에 올릴 필요 없음 Integer와 동일
		String result03 = String.valueOf(1000);
		System.out.println(result03+2);
		
		// 꿀팁
		String result04 = "" + 999; //문자열 + 숫자 = 문자열 <<이게 더 편함
		
		
		
	}

}
