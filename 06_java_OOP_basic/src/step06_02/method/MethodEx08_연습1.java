package step06_02.method;

/* 2024-11-15 13:04 ~ 13:10
 * 
 * 느낀점: 
 * 고쳐야할점: 
 * 
 */


class Ex08_Practice1 {
	
	void printSum(int[] arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("1) 정답: " + sum);
		
	}
	
	void printSumMultiple4(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
			
		}
		System.out.println("2) 정답: " + sum);
		
	}
	
	void printCountMultiple4(int[] arr) {
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0) {
				cnt++;
			}
			
		}
		System.out.println("3) 정답: " + cnt);
		
	}
	
}


public class MethodEx08_연습1 {

	public static void main(String[] args) {
		
		Ex08_Practice1 object = new Ex08_Practice1();
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		object.printSum(arr);

		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		object.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		object.printCountMultiple4(arr);

	}

}
