package step06_02.method;

/* 2024-11-15 12:58 ~ 13:04
 * 
 * 느낀점: 
 * 고쳐야할점: 
 * 
 */


class Ex07_Practice1 {
	
	void printEvenOrOdd(int x) {
		
		if (x % 2 == 0) {
			System.out.println("1) 정답: 짝수");
		}
		else {
			System.out.println("1) 정답: 홀수");
		}
		
	}
	void getAvgBetweenValues(int x, int y) {
		
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println("2) 정답: " + sum);
		
	}

	void printPrimeNums(int primeNumber) {
		
		for (int i = 1; i <= primeNumber; i++) {
			int cnt = 0;
			
			for (int j = 1; j <= i; j++) {
				
				if (i % j == 0) {
					cnt++;
				}
				
			}
			
			if (cnt == 2) {
				System.out.print(i + " ");
			}
			
		}
		
	}
}


public class MethodEx07_연습1 {

	public static void main(String[] args) {
		
		Ex07_Practice1 object = new Ex07_Practice1();
		
		// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
		int num = 19;
		object.printEvenOrOdd(num);

		// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
		int x = 1;
		int y = 10;
		object.getAvgBetweenValues(x, y);

		// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
		int primeNumber = 20;
		object.printPrimeNums(primeNumber);

	}

}
