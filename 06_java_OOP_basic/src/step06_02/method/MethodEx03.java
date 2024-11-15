package step06_02.method;

/*
 * 
 * # return
 *   
 * 	1) 데이터를 반환한다. return 데이터는 오직 1개이다. 
 *  2) 메서드를 종료한다.
 *  
 * */


class Member {
	
	String id;
	String password;
	String name;
	
}

class ReturnEx{
	
	void setScore1(int score1) {
		
		score1 = 100;
		
	}
	
	int setScore2(int score2) {
		
		score2 = 100;
		return score2;
		
	}
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
//		return 1, 2 ,3 ,4;	// return 데이터는 1개반 가능 -> exception 발생
		return 0;
		
		// return이 실행되는 순간 메소드가 종료 -> exception 발생
//		Unreachable code
//		System.out.println("리턴 전 명령어1");
//		System.out.println("리턴 전 명령어2");
//		System.out.println("리턴 전 명령어3");
		
	}
	
//	Thinking
	int[] test1() {
		
		int[] arr = {1, 2, 3, 4};
		return arr;	// 가능
 		
	}
	
	Member test2() {
		
		Member member = new Member();
		member.id = "admin";
		member.password = "admin";
		member.name = "관리자";
		return member; // 가능
		
	}
	
	String test3() {
		
		int n = 1;
		
		if (n % 2 == 0) {
			return "짝수";	// 가능
		}
		else {
			return "홀수";	// 가능
		}
		
	}
	
	String test4() {
		
		int n = 1;
		
		if (n % 2 == 0) {
			return "짝수";	// 가능
		}
		return "홀수";		// test3과 같은 결과
		
	}
	
}


public class MethodEx03 {

	public static void main(String[] args) {

		ReturnEx object = new ReturnEx();
		
		int score1 = 777;
		System.out.println("메소드 호출 전: " + score1); 	// 777
		
		object.setScore1(score1);
		System.out.println("메소드 호출 후: " + score1); 	// 777
		
		System.out.println("\n================\n");
		
		int score2 = 777;
		System.out.println("메소드 호출 전: " + score2); 	// 777
		
		object.setScore1(score2);
		System.out.println("메소드 호출 후: " + score2); 	// 777 (return값을 저장한 부분이 없음)
		
		score2 = object.setScore2(score2);
		System.out.println("메소드 호출 후(return값 저장): " + score2); 	// 100

	}

}
