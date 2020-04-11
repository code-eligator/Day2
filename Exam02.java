package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;


/*
 * 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오.
 * 
 * ex) input  : 3661
 *     output : 1시간 1분 1초
 * 
 */
public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		
		int second, min, hour;
		while(true) {
			second = sc.nextInt();
			sc.nextLine();
			if(second > 0) 
				break;
			else 
				System.out.println("양수를 입력해주세요.");
			
		}
		
		hour = second / 3600;
		
		if(hour > 0) {
			second = second - hour*3600;
			System.out.printf("%d시간 ", hour);
		}
		
		min = second / 60;
		if(min > 0) {
			second = second - min*60;
			System.out.printf("%d분 ", min);
		}
		
		if(second > 0) {
			System.out.printf("%d초\n", second);
		}
		
	}
}
