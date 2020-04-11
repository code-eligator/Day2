package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;

/*
 * 화면에서 알파벳을 입력받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오.
 * 
 * ex) input  : abCDe
 *     output : ABcdE
 * 
 */

public class Exam07 {

	public static void main(String[] args) {
		System.out.printf("입력(알파벳) : " );
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		

		String str = "";
		
		for (int i = 0; i < inputStr.length(); i++) {
			char c = inputStr.charAt(i);
			if(c < 97) { // upper Char
				c += 32;
				str += c;
			}
			else {		  // lower Char
				c -= 32;
				str += c;
			}
		}
		
		System.out.println("변경된 값 " + str);

	}
}
