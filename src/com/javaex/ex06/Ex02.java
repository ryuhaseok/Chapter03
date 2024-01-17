package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(", efg");
		
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		*/
		
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("ab", "123456789");
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		
		//문자열 나누기
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		String str = "Hello JAVA!";
		
		String result01 = str.substring(3);
		String result02 = str.substring(1, 7);
		
		System.out.println(result01);
		System.out.println(result02);
		
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("---------------------------");
		
		String s01 = new String("안녕");
		String s02 = new String("안녕!");
		
		if(s01==s02) {
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("글자 같음");
		} else {
			System.out.println("글자 다름");
		}
		
		System.out.println("---------------------------");
		String s03 = "안녕";
		
		//꿀팁
		//s03은 값이 있을 수도 null(주소값 없음)일 수도 있음 null일때 .equals를 사용할 수 없음
		//따라서 "확실한 값이 정해져있는 "안녕".equals를 사용하면 항상 사용 가능
		if("안녕".equals(s03)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		Integer i = 3;
		
	}

}
