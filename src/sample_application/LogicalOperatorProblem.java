package sample_application;

import java.util.Scanner;

public class LogicalOperatorProblem {
	public static void main (String[] args) {
		// Ctrl + Shift + o
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * 문제
		 * 변수형 변수 두 개를 생성하고
		 * keyboard.nextInt()를 이용해 값을 각각의 변수에 할당한 뒤
		 * 
		 * 두 변수의 값 중 큰 값을 가진 변수의 값을 출력!
		 * (3항 연산자 사용)
		 * 
		 */
		
		System.out.println("첫 번째 숫자를 입력하세요");
		int number1 = keyboard.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int number2 = keyboard.nextInt();
		
		System.out.println(number1>number2 ? number1 : number2);
		
		// 3항 연산자 잘 사용하지 않는 이유
		// 조건과 처리의 구분이 모호하다 ==> 의미를 분석하기 쉽지 않다
		int biggestNumber = number1 > number2 ? number1 :number2;
		System.out.println(biggestNumber);
	}
}
