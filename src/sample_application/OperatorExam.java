package sample_application;

public class OperatorExam {
	public static void main (String[] args) {
		final int CHANGE = 60;
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		
		time = minutes * CHANGE + seconds;
		System.out.println(time + "초");
		
		int processTime = 145;
		int minutes2 = 0;
		int seconds2 = 0;
		
		minutes2 = processTime / 60;
		seconds2 = processTime % 60;
		System.out.println(minutes2 + "분");
		System.out.println(seconds2 + "초");
		
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println(fahrenheit + "F");
		
		// 커밋 연습

	}
}
