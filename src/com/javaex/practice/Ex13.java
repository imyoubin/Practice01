package com.javaex.practice;

public class Ex13 {
	
	public static void main(String[] args) {
		/*
		다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요  //1,7번 
		*/
		double a = 13/5;     
		System.out.println(a);	//1
		
		double b = (double)13/5;
		System.out.println(b);	//2
		
		double c = 13/(double)5;
		System.out.println(c);	//3
		
		double d = (double)13/(double)5;
		System.out.println(d);	//4
		
		double e = 13.0/5;
		System.out.println(e);		//5
		
		double f = 13/5.0;
		System.out.println(f);		//6
		double g = (double)(13/5);
		System.out.println(g);		//7
	}

}
