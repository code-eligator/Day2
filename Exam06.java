package kr.ac.jinwoo.day02.homework;

/*
 * 알파벳이 모두 몇 자인지 화면에 출력하시오.
 * 
 * ex) output : 52
 * 
 */

public class Exam06 {
	
	public static void main(String[] args) {
		
		int lowerAlphabetCount = 'z' - 'a' +1;
		int upperAlphabetCount = 'Z' - 'A' +1;
		
		System.out.printf("알파벳의 수 : %d\n", lowerAlphabetCount + upperAlphabetCount);
	}
}
