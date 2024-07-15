package sample_application;

import java.util.Scanner;

public class PracticeIfElse {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int korScore = keyboard.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int engScore = keyboard.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int mathScore = keyboard.nextInt();
		System.out.println("프로그램 점수를 입력하세요");
		int progScore = keyboard.nextInt();
		int sum = korScore + engScore + mathScore + progScore;
		int average = sum / 4;
		
		int money = 1_000_000;
		
		System.out.println("아빠 나이");
		int father = keyboard.nextInt();
		
		System.out.println("엄마 나이");
		int mother = keyboard.nextInt();
		
		System.out.println("자녀 나이");
		int daughter = keyboard.nextInt();
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int flightFee = adultOneWayFlightFare * 2 + kidOneWayFlightFare;
		int flightPay = 0;

		System.out.println(average);
		
		if(average >= 95) {
			System.out.println("성적: A+");
		}else if(average >= 90) {
			System.out.println("성적: A");
		}else if(average >= 85) {
			System.out.println("성적 B+");
		}else if(average >= 80) {
			System.out.println("성적: B");
		}else if(average >= 70) {
			System.out.println("성적: C");
		}else {
			System.out.println("성적: F");
		}

		System.out.println("여행 경비: " + flightFee);
		if(money >= flightFee) {
			System.out.println("여행가자!");
		}else {
			System.out.println("다음에 가자");
		}
		
		if(father>=19) {
			flightPay += adultOneWayFlightFare;
		}else {
			flightPay += kidOneWayFlightFare;
		}
		
		if(mother>=19) {
			flightPay += adultOneWayFlightFare;
		}else {
			flightPay += kidOneWayFlightFare;
		}
		
		if(daughter>=19) {
			flightPay += adultOneWayFlightFare;
		}else {
			flightPay += kidOneWayFlightFare;
		}
		System.out.println(flightPay);
		if(money >= flightPay) {
			System.out.println("여행가자!");
		}else {
			System.out.println("다음에 가자");
		}
	}
}
