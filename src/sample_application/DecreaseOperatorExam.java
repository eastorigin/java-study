package sample_application;

public class DecreaseOperatorExam {
	
	/**
	 * 클래스를 실행시키는 특별한 코드
	 * @param args
	 */
	public static void main (String[] args) {
		// 스스로에게 1을 빼는 실습
		// 일반 연산자
		int number1 = 0;
		number1 = number1 - 1;
		
		// 짧은 연산자
		number1 = 0; // 0으로 초기화 (재할당)
		number1 -=1;
		
		// 단항 연산자
		number1 = 0; // 0으로 초기화 (재할당)
		number1--;
		System.out.println(number1);
		System.out.println(number1--); // 1. -1
		System.out.println(number1--); // 2. -2
		System.out.println(number1--); // 3. -3
		System.out.println(number1); // 4. -4
		
		// 후수행: ++가 뒤에 붙어있으면 number1을 먼저 출력한 다음에 1을 더함
		
		int number2 = 0;
		--number2;
		System.out.println(number2); // -1
		System.out.println(--number2); // 1. -2
		System.out.println(--number2); // 2. -3
		System.out.println(--number2); // 3. -4
		System.out.println(number2); // 4. -4
		
		// 선수행: 괄호에 있는 것을 먼저 함
	}
}
