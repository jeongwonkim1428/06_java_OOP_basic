package step06_02.method;

import java.util.Arrays;

/* 2024-11-15 15:12 ~ 15:21
 * 
 * 느낀점: 
 * 고쳐야할점:for문에 int 배열 생성하는 문장을 넣으면 i가 증가 할 때마다 새로운 배열이 생성 -> 전에 있는 값을 저장되지 않음
 * 
 */


class Ex10_Practice1 {
	
	int test1(int[] arr) {
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 ==0) {
				cnt++;
			}
			
		}
		
		return cnt; 
	
	}
	
	int[] test2(int[] arr) { 
		
		int cnt = test1(arr);
		int[] temp = new int[cnt];
		
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0) {
				temp[idx] = arr[i];
				idx++;
			}
			
		}
		
		return temp;
	
	}
	
}



public class MethodEx10_연습1 {

	public static void main(String[] args) {
		
		Ex10_Practice1 object = new Ex10_Practice1();
		
		int[] arr = {87, 12, 21, 56, 100};
		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int cnt = object.test1(arr);
		System.out.println("cnt = " + cnt);
		
		// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
		int[] temp = object.test2(arr);
		System.out.println(Arrays.toString(temp));

	}

}
