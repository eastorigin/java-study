package sample_application;

public class TypeCastingExam {
	public static void main(String[] args) {
		short shortNumber = 10_000;
		int intNumber = shortNumber;
		
		long longNumber = 2_100_000_000L * 2;
		System.out.println(longNumber);
		
		int intNumber2 = (int) longNumber;
		System.out.println(intNumber2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);
		
		int score1 = 100;
		int score2 = 30;
		
		double divResult = (double) score1 / score2; // 정수 + 부동소수점 = 부동소수점
		System.out.println(divResult);
		
		double divResult2 = (score1 * 1.0) / score2;
		System.out.println(divResult2);
	}
}
