package sample_application;

/**
 * <pre>
 * Document 주석
 * 
 * 클래스나 메소드 혹은 멤버변수들을 설명하기 위한 가이드.
 * 
 * 해당 클래스나 메소드 혹은 멤버변수에 마우스를 가져다 올리면 주석이 툴팁으로 나타난다.
 * <pre>
 */
public class AverageScore {
	
	/**
	 * 형변환 예제 실습 번호
	 */
	
	int testCaseNumber;
	
	/**
	 * 클래스의 실행을 담당하는 메소드.
	 * 
	 * @param args 실행할 때 전달된 데이터
	 */
	public static void main(String[] args) {
		
		// 주석: 코드에 설명을 붙이는 것.
		// 컴파일러 또는 JVM에 변환 / 실행시키지 않는 영역.
		// Single line Comment
		
		/*
		 * 여러 줄 주석으로 사용할 수 있는 문법.
		 * Multi line Comment
		 */
		
		int math = 70;
		int korean = 60;
		int music = 80;
		int art = 100;
		
		double averageScore = (math + korean + music + art) * 1.0 / 4;
		double averageScore2 = (math + korean + music + art) / 4.0;
		double averageScore3 = ((double) math + korean + music + art) / 4;
		double averageScore4 = (double) (math + korean + music + art) / 4;
		
		System.out.println(averageScore);
		System.out.println(averageScore2);
		System.out.println(averageScore3);
		System.out.println(averageScore4);
		
		int number1 = 9725;
		double number2 = number1 / 100.0; // 100.00까지 할 필요는 없음
		System.out.println(number2);
		
		double number3 = 93.167;
		double number4 = number3 * 100;
		double number5 = Math.round(number4);
		double number6 = number5 / 100;
		System.out.println(number6);
		
		double number7 = Math.round(number3 * 100) / 100.0; // 100.0으로 나누어야 하는 이유는 Math.round(number3 * 100) = 9317이라 정수이기 때문
		System.out.println(number7);
		
		double average2 = 93.167;
		double tempAverage = average2 * 100;
		long intAverage = Math.round(tempAverage);
		average2 = (double) intAverage / 100;
		System.out.println(average2);
		
		average2 = 93.167;
		average2 = round(average2, 2);
		System.out.println(average2);
		
	}
	
	public static double round(double value, int point) {
		double result = value * Math.pow(10, point);
		result = Math.round(result);
		result /= Math.pow(10, point);
		return result;
	}
}
