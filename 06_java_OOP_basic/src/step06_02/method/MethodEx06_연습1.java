package step06_02.method;

import java.util.Arrays;

/* 2024-11-15 12:54 ~ 12:58
 * 
 * 느낀점: 
 * 고쳐야할점: 
 * 
 */


class Ex06_Practice1{
	
	void test1(int x, int y) {
		
		System.out.println("1) 정답: " + (x + y));
		
	}
	
	void test2(int[] arr) {
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("2) 정답: " + max);
		
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.println("3) 정답: " + Arrays.toString(arr));
		
	}
	
}


public class MethodEx06_연습1 {

	public static void main(String[] args) {
		
		Ex06_Practice1 object = new Ex06_Practice1();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		object.test1(x, y);
		
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		object.test2(arr);
		
		// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		object.test3(arr, idx1, idx2);

	}

}
