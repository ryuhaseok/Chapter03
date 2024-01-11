package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//String 클래스는 메모리에 한 번 올리면 변경 불가
		// 값을 바꾸면 메모리를 새로 만들어 올림
		String s01 = "안녕하세요";
		String s02 = "안녕하세요"; //같은 문자열을 가진 객체를 찾아 연결한다

		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01 == s02); //주소가 같냐
		
		s01 = "안녕";
		
		System.out.println(s01 == s02); //주소가 같냐
		
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println("-----------------------------------");
		
		String s03 = new String("하이"); //각각의 메모리로 올라감
		String s04 = new String("하이");
		
		System.out.println(s03 == s04);
		
	}
	
}
