package step06_02.method;

/*
 * 
 *  # 메서드 (method)
 *  
 *  - 클래스 기반 언어에서 클래스 내부에 정의되어 있다. 
 *  - 메서드는 프로그램이 실행되고 있을 때 클래스에서 생성된 인스턴스와 관련된 동작을 정의한다.
 *  
 *  [ 형태 ]
 * 
 * 	1) void       : return 타입 (int , double , char , String , int[] , Product , ....)
 * 	2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  3) ()         : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)
 *  4) {}         : 메서드의 영역
 *  
 * */

class MethodEx{
	
/*	
	반환타입 이름(투입구) {	//메소드 이름은 주로 동사형태로 작성
		알고리즘;
		return 결과;		// 반환 데이터가 없을 경우 return 생략 가능
	}
*/
	// 메소드 정의(Method Define)
	void printMenu() {
		
		System.out.println("============");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 종료");
		System.out.println("============\n");
		
	}
	
}

public class MethodEx01 {

	public static void main(String[] args) {
		
		MethodEx object = new MethodEx();
		
		// 메소드 호출(Method Call)
		// 객체.메소드이름(); 형태로 호출하여 사용
		object.printMenu();
		object.printMenu();
		object.printMenu();
		
//		scan.nextInt();
//		scan.close();
//		br.readLine();
//		sdf.format();
		
	}

}
