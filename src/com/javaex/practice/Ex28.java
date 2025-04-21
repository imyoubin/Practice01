package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {
	
	public static void main(String[] args) {
		
		 final double daller = 1230.95;

		 final double EXCHANGE_RATE = 1230.95;  // 환율 상수

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("환전할 원화를입력하세요: ");
	        double won = scanner.nextDouble();

	        double dollar = won / EXCHANGE_RATE;

	        System.out.printf("받으실 달러는 %.2f %n", dollar);

	        scanner.close();
	}
}
