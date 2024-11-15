
package step06_02.method;

import java.util.Arrays;

/* 2024-11-15 13:10 ~ 13:38
 * 
 * 느낀점: 
 * 고쳐야할점: 
 * 
 */

import java.util.Random;
import java.util.Scanner;


class Ex09_Practice1 {

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int[] scores) {
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rand.nextInt(1, 101);
		}
		System.out.println("1) 점수: " + Arrays.toString(scores));
		
	}
	
	//문제 2)
	void printSumAndAverage(int[] scores) {
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = sum / (double)scores.length;
		System.out.println("2) 총점: " + sum + "점, 평균: " + avg + "점");
		
	}
	
	//문제 3)
	void printWinner(int[] scores) {
		
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			
			if (scores[i] >= 60) {
				cnt++;
			}
			
		}
		System.out.println("3) 합격생 수: " + cnt + "명");
		
	}
	
	//문제 4)
	void printScore1(int[] scores) {
		
		System.out.print("4) 인덱스 입력: ");
		int idx = scan.nextInt();
		
		System.out.println("4) 성적: " + scores[idx] + "점");
		
	}
	
	//문제 5)
	void printScore2(int[] scores) {
		
		System.out.print("5) 성적 입력: ");
		int score = scan.nextInt();
		
		int idx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			
			if (scores[i] == score) {
				idx = i;
			}
			
		}
		System.out.println("5) 인덱스: " + idx);
		
	}
	
	//문제 6)
	void printScore3(int[] hakbuns, int[] scores) {
		
		System.out.print("6) 학번 입력: ");
		int hakbun = scan.nextInt();
		int idx = -1;
		
		for (int i = 0; i < hakbuns.length; i++) {
			
			if (hakbun == hakbuns[i]) {
				idx = i;
			}
			
		}
		if (idx == -1) {
			System.out.println("입력하신 학번이 존재하지 않습니다.");
		}
		else if (idx >= 0 && idx < scores.length) {
			System.out.println("6) 성적: " + scores[idx] + "점");
		}
		
		scan.close();
		
	}
	
	//문제 7)
	void printNumberOne(int[] hakbuns, int[] scores) {
		
		int maxIdx = 0;
		int maxScore = scores[0];
		
		for (int i = 1; i < scores.length; i++) {
			
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
			
		}
		System.out.println("7) 1등학생: " + hakbuns[maxIdx] + "번(" + scores[maxIdx] + "점)");
		
	}
	
}



public class MethodEx09_연습1 {

	public static void main(String[] args) {
		
		Ex09_Practice1 object = new Ex09_Practice1();
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		
		object.setRandomValuesinArray(scores);
		System.out.println();

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		object.printSumAndAverage(scores);
		System.out.println();

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		object.printWinner(scores);
		System.out.println();

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		object.printScore1(scores);
		System.out.println();

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		object.printScore2(scores);
		System.out.println();

		// 문제6) 학번을 입력받아 성적 출력하는 메서드
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		object.printScore3(hakbuns, scores);
		System.out.println();

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		object.printNumberOne(hakbuns, scores);
		System.out.println();

	}

}
