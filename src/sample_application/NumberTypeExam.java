package sample_application;

public class NumberTypeExam {
	public static void main(String[] args) {
		byte byteNumber = 1;
		short shortNumber = 10;
		int intNumber = 1_000_000_000;
		long longNumber = 3_000_000_000l;
		
//		long byteNumber = 30l; 타입이 다르더라도 동일 변수 종복 설정 불가능
		
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		
		float floatNumber = 50;
		double doubleNumber = 100;
		
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		
		float floatNumber2 = 10.33333333f; // 뒤에 f 붙이기
		double doubleNumber2 = 50.66666666666666;
		
		System.out.println(floatNumber2);
		System.out.println(doubleNumber2);
		
		final int AGE = 10;
//		AGE = 20; 상수 값은 바꿀 수 없다.
		final int MY_AGE; // 상수는 다 대문자로 정의하기 때문에 단어와 단어 사이에는 언더바를 작성한다.
		MY_AGE = 30;
//		My_AGE = 40; 값을 할당한 순간부터 바꿀 수 없다.
	}
}
