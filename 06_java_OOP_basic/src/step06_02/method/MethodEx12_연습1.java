package step06_02.method;

import java.util.Arrays;

/* 2024-11-15 15:50 ~ 16:45
 * 
 * 느낀점: 3번, 7-2번 다시
 * 고쳐야할점: 
 * 
 */


class Ex12_Practice1 {
	
	// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
	int myABS(int param) {
		
		if (param < 0) {
			return -param;
		}
		
		return param;
		
	}
	
	// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
	boolean checkEmailValidation(String email) {
		
		String[] letter = email.split("");
		int exist = 0;
		
		for (int i = 0; i < letter.length; i++) {
			
			if (letter[i].equals("@")) {
				exist = 1;
			}
			
		}
		
		if (exist == 1) {
			return true;
		}
		
		return false;
		
	}
	
	// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
	String getFileExtention(String fileName) {
		
		int cnt = 0;
		
		for (int i = 0; i < fileName.length(); i++) {
			
			if ('.' == fileName.charAt(i)) {
				cnt = i;
			}
			
		}
		
		return fileName.substring(cnt + 1);
		
	}
	
	// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
	int myPow(int param1 , int param2) {
		
		int result = 1;
		
		for (int i = 0; i < param2; i++) {
			result *= param1;
		}
		
		return result;
		
	}
	
	// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
	int myIndexOf(String data , String word) {
		
		String[] letters = data.split("");
		int idx = 0;
		
		for (int i = 0; i < letters.length; i++) {
		
			if (letters[i].equals(word)) {
				idx = i;
			}
			
		}
		
		return idx;
		
	}
	
	// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
	// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
	// 예시)                      > char[] 변수 = 문자열.toCharArray();
	char myCharAt(String data , int index) {
		
		char[] letter = data.toCharArray();
		
		return letter[index];
		
	}
	
	// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
	String mySubString1(String data , int startIndex) {
		
		String[] letters = data.split("");
		String result= "";
		
		for (int i = startIndex; i < letters.length; i++) {
			result += letters[i];
		}
		
		return result;
		
	}
	
	// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
	String mySubString2(String data , int startIndex , int endIndex) {
		
		String result = "";
		
		for (int i = startIndex; i < endIndex; i++) {
			result += data.charAt(i);
		}
		
		return result;
		
	}
	
	// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
	String[] mySplit(String data , String sep) {
		
		String[] words = data.split(sep);
		
		return words;
		
	}
	
}


public class MethodEx12_연습1 {

	public static void main(String[] args) {

		Ex12_Practice1 object = new Ex12_Practice1();
		
		// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
		System.out.println("<1번>");
		System.out.println(object.myABS(3));   // 3
		System.out.println(object.myABS(-3));  // 3 
		System.out.println(object.myABS(12));  // 12 
		System.out.println(object.myABS(-12)); // 12
		System.out.println();
		
		// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
		System.out.println("<2번>");
		System.out.println(object.checkEmailValidation("qwer1234@naver.com"));    // true
		System.out.println(object.checkEmailValidation("qwer1234"));    			 // false
		System.out.println(object.checkEmailValidation("abcde@gmail.com"));    	 // true
		System.out.println(object.checkEmailValidation("abcde"));    			 // false
		System.out.println();
		
		// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
		System.out.println("<3번>");
		System.out.println(object.getFileExtention("1.jpg"));  			// jpg   
		System.out.println(object.getFileExtention("캡처.png"));  		// png  
		System.out.println(object.getFileExtention("수업자료.txt"));  		// txt  
		System.out.println(object.getFileExtention("프로젝트 제안서.pdf"));  // pdf   
		System.out.println();
		
		// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
		System.out.println("<4번>");
		System.out.println(object.myPow(3, 2));	// 9
		System.out.println(object.myPow(4, 2));	// 16
		System.out.println(object.myPow(5, 3));	// 125
		System.out.println(object.myPow(7, 3));	// 343
		System.out.println();
		
		// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
		System.out.println("<5번>");
		System.out.println(object.myIndexOf("just do it!", "j"));  // 0
		System.out.println(object.myIndexOf("just do it!", "s"));  // 2
		System.out.println(object.myIndexOf("just do it!", "i"));  // 8
		System.out.println(object.myIndexOf("just do it!", "!"));  // 10
		System.out.println();
		
		// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
		// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
		// 예시)                      > char[] 변수 = 문자열.toCharArray();
		System.out.println("<6번>");
		System.out.println(object.myCharAt("just do it!", 0));    // j
		System.out.println(object.myCharAt("just do it!", 2));    // s
		System.out.println(object.myCharAt("just do it!", 8));    // i
		System.out.println(object.myCharAt("just do it!", 10));   // !
		System.out.println();
		
		// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
		System.out.println("<7-1번>");
		System.out.println(object.mySubString1("200107-1234567", 2));    // 0107-1234567
		System.out.println(object.mySubString1("200107-1234567", 4));	// 07-1234567
		System.out.println(object.mySubString1("200107-1234567", 7));	// 1234567
		System.out.println(object.mySubString1("200107-1234567", 10));	// 4567
		System.out.println();
		
		// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
		System.out.println("<7-2번>");
		System.out.println(object.mySubString2("200107-1234567", 0 , 2)); // 20
		System.out.println(object.mySubString2("200107-1234567", 2 , 4)); // 01
		System.out.println(object.mySubString2("200107-1234567", 4 , 6)); // 07
		System.out.println(object.mySubString2("200107-1234567", 0 , 6)); // 200107
		System.out.println();
		
		// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
		System.out.println("<8번>");
		System.out.println(Arrays.toString(object.mySplit("a,b,c", ",")));		  // [a, b, c]
		System.out.println(Arrays.toString(object.mySplit("a,b,c,e,f,g", ",")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(object.mySplit("a/b/c/e/f/g", "/")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(object.mySplit("goodsId=1 & goodsNm=스마트 TV & goodsPrice=3000000 & orderQty=1 & ordererId=qwer1234", "&")));  // [goodsId=1 ,  goodsNm=스마트 TV ,  goodsPrice=3000000 ,  orderQty=1 ,  ordererId=qwer1234]
		
	}

}
