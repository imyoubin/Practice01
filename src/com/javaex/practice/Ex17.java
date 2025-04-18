package com.javaex.practice;

public class Ex17 {
	
	public static void main(String[] agrgs) {
		/*
		다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요.)
		
		int x, y
		x = 10
		y = 20
		sum = x+y
		System.out.println("합은 ' + sum);
		int 함수와 x값과 y값을 따로 주고 sum에 int함수를 앞에 넣어주고 "합은'이 아니라 "합은"이라 넣어줘야함
		*/
		int x = 10;
		int y = 20;
		int sum = x+y;
		System.out.println("합은 " + sum);
	}
	

}
