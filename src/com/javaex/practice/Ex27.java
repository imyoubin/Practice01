package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		final double PI = 3.14; 

        Scanner sc = new Scanner(System.in);

        System.out.print("반지름을 입력하세요: ");
        int radius = sc.nextInt();

        if (radius > 0) {
            double area = PI * radius * radius;
            System.out.println("원의 넓이는 " + area);
        } else {
            System.out.println("반지름은 0보다 커야 합니다.");
        }
				
		
		sc.close();
	}

}
