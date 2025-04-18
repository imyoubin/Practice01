package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요");
		int  salary = sc.nextInt();
		if (salary>=200) {
			
		System.out.println("10년동안 최대 저축액은 24000원 입니다");
			
		}
		
		sc.close();
	}

}
