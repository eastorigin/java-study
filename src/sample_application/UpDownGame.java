package sample_application;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main (String[] args) {
		
		// Psuedo Code (의사 코드)
		// 코드의 논리식을 문자로 나열.
		
		// Ctrl + Shift + o
		String string = "";
		// 1. 랜덤한 숫자 하나를 생성.
		Random random = new Random();
		int number1 = random.nextInt(100);
		
		// 2. 사용자가 숫자를 입력.
		System.out.println("숫자를 입력해주세요");
		Scanner keyboard = new Scanner(System.in);
		int number2 = keyboard.nextInt();
		
		// 3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교.
			// "정답입니다" 출력
		if(number1 == number2) {
			string = "정답입니다";
			// System.out.println("정답입니다");
			
		}
		
		// 4. 랜덤한 숫자가 사용자가 입력한 숫자보다 작은지 비교.
			// "Down!" 출력.
		else if(number1 < number2) {
			// System.out.println("Down!");
			string = "Down!";
		}
		
		// 5. 랜덤한 숫자가 사용자가 입력한 숫자보다 큰 지 비교.
			// "Up!" 출력.
		else {
			// System.out.println("Up!");
			string = "Up!";
		}
		System.out.println(string);
		System.out.println("랜덤 숫자: " + number1);
	}
}
