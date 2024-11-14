package step06_01.classObject;

/* 2024-11-14 16:30 ~ 16:34
 * 
 * 느낀점: 
 * 고쳐야할점: 
 * 
 */

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

  
class Ex03_Practice1 {
	
	int[] arr = {87, 100, 11, 72, 92};
	
	
}


public class ClassEx03_연습1 {

	public static void main(String[] args) {
		
		Ex03_Practice1 object = new Ex03_Practice1();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int sum = 0;
		
		for (int i = 0; i < object.arr.length; i++) {
			sum += object.arr[i];
		}
		System.out.println("1) " + sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		sum = 0;
		
		for (int i = 0; i < object.arr.length; i++) {
			
			if (object.arr[i] % 4 == 0) {
				sum += object.arr[i];
			}
			
		}
		System.out.println("2) " + sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		
		for (int i = 0; i < object.arr.length; i++) {
			
			if (object.arr[i] % 4 == 0) {
				cnt++;
			}
			
		}
		System.out.println("3) " + cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		cnt = 0;
		
		for (int i = 0; i < object.arr.length; i++) {
			
			if (object.arr[i] % 2 == 0) {
				cnt++;
			}
			
		}
		System.out.println("4) " + cnt);

	}

}
