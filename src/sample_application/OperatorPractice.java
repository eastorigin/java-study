package sample_application;

public class OperatorPractice {
	public static void main (String[] args) {
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = minutes * 60 + seconds;
		System.out.println(time);
		
		int processTime = 145;
		int minutes2 = 0;
		int seconds2 = 0;
		
//		minutes2 = (int) Math.floor(processTime / 60);
		minutes2 = processTime / 60; // 정수 나눗셈은 자동으로 소수점을 버리기 때문에, 분(minute)을 계산할 때 Math.floor를 쓰지 않아도 올바른 결과를 얻을 수 있습니다.
		System.out.println(minutes2);
		
//		seconds2 = processTime - minutes2 * 60;
		seconds2 = processTime % 60;
		System.out.println(seconds2);
		
		int celsius = 30;
		int fahrenheit = 0;
		
//		변경공식: (섭씨 × 9/5) + 32 = 화씨
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println(fahrenheit);

	}
}
