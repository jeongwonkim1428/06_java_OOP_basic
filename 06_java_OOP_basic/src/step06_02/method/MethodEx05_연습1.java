package step06_02.method;

import java.util.Scanner;

/* 2024-11-15 12:31 ~ 12:53
 * 
 * 느낀점: 
 * 고쳐야할점: 주석 해당 글자 지울경우 주의, 입력받을 경우 문구 반드시 기입
 * 
 */


class Ex05_Practice1 {

	void test1() {
		
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println("1~5의 합: " + sum);
		
	}
	
	void test2() {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] 숫자 입력: ");
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		
		System.out.println("정수 3개 중 최대값: " + max);
		
		scan.close();
	}
	
}


public class MethodEx05_연습1 {

	public static void main(String[] args) {
		
			Ex05_Practice1 object = new Ex05_Practice1();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			object.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			object.test2();

	}

}
