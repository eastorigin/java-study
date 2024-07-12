package sample_application;

import java.util.Scanner;

public class LogicalOperator {
	public static void main (String[] args) {
		// 키보드에서 숫자를 입력받아 변수에 할당하기
		// Ctrl + Shift + o
		Scanner keyboard = new Scanner(System.in);
		
		// keyboard.nextInt(); // 키보드에서 숫자 입력을 받는 코드
		
		System.out.println("0보다 크고 100보다 작은 숫자를 입력하고 엔터를 치세요.");
		// 키보드에서 숫자 입력을 받아 변수에 할당하는 코드
		int firstNumber = keyboard.nextInt();
		System.out.println("방금 입력한 숫자는 " + firstNumber + "입니다.");
		
		boolean isGreaterThanZero = firstNumber > 0; // boolean 형태의 이름은 항상 동사로 시작
		System.out.println("0보다 큰가요? " + isGreaterThanZero);
		
		// 3항 연산자
		// 조건(불린 결과) ? true일 때의 처리 : false일 때의 처리;
		// firstNumber가 0보다 작은 숫자인 경우 "음수입니다" 출력
		// firstNumber가 0보다 큰 숫자인 경우 "양수입니다" 출력
		System.out.println(firstNumber > 0 ? "양수입니다." : "음수입니다.");
		
		boolean isSmallerThanHundred = firstNumber < 100;
		System.out.println("100보다 작은가요? " + isSmallerThanHundred);
		
		// firstNumber가 100보다 작은 숫자인 경우 "알맞은 숫자입니다." 출력
		// firstNumber가 100보다 큰 숫자인 경우 "너무 큰 숫자입니다." 출력
		
		System.out.println(firstNumber < 100 ? "알맞은 숫자입니다." : "너무 큰 숫자입니다.");
		System.out.println(isGreaterThanZero && isSmallerThanHundred);
		System.out.println(isGreaterThanZero || isSmallerThanHundred);
		
		// boolean isValidNumber = firstNumber > 0 && firstNumber < 100;
		// boolean isValidNumber = isGreaterThanZero == true && isSmallerThanHundred == true; boolean을 다시 boolean으로 할 필요가 없음. 그래서 뒤에 == true가 필요없음
		boolean isValidNumber = isGreaterThanZero == true && isSmallerThanHundred == true;
		System.out.println("0보다 크고 100보다 작은가요? " + isValidNumber);
		System.out.println(firstNumber > 0 && firstNumber < 100 ? "성공!" : "실패!");
		System.out.println(isGreaterThanZero && isSmallerThanHundred ? "성공!" : "실패!");
	}
}
