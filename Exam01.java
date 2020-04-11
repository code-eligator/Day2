package kr.ac.jinwoo.day02.homework;


/*
 * 영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오.
 * 
 * ------------------
 * 영문자 모음의 아스키 코드 값
 * ------------------
 * A = 65
 * E = 69
 * I = 73
 * O = 79
 * U = 85
 * 
 */

public class Exam01 {

	public static void main(String[] args) {
		int characterA = 'A', characterE = 'E',
				characterI = 'I', characterO = 'O', characterU = 'U';
		
		System.out.println("--------------------");
		System.out.println("영문자 모음의 아스키 코드의 값");
		System.out.println("--------------------");
		System.out.printf("A = %d\n", characterA);
		System.out.printf("E = %d\n", characterE);
		System.out.printf("I = %d\n", characterI);
		System.out.printf("O = %d\n", characterO);
		System.out.printf("U = %d\n", characterU);
		System.out.println("-------------------------\n");
		
	}
}
