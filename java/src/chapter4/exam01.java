package chapter4;

import java.util.Scanner;

public class exam01 {
	


	public static void main(String[] args) {
		

		/*
		 * 조건문 : 조건을 만족하거나, 만족하지 않을때 실행 if(조건식) {조건 만족시 실행 할 문장들}
		 */
		Scanner sc = new Scanner(System.in);
//		int x = Integer.parseInt(sc.nextLine());  //Line 값입력
//		System.out.println("숫자를 입력하세요 :");
//		if (x % 2 == 0) {
//			System.out.println("이 숫자는 짝수입니다.");
//		} else {                     //if가 아니라면 
//		//if (x%2 == 1) {                  //확인하지않고 바로 다음으로 넘어감
//			System.out.println("이 숫자는 홀수 입니다.");  
//		}
		
//		if (x >=100) {
//			System.out.println("이숫자는 100 이상입니다");
//		}
		System.out.println("가위 바위 보 중 하나를 입력해주세요 :");
		String s = sc.nextLine();
		int result = 0;
		
		System.out.println("입력한 값"+s);
		
		//가위 : 1   , 바위 : 2  , 보 : 3
//		System.out.println("가위".equals(s));
//		System.out.println(s.equals("가위"));
		
		if (s.equals("가위") ) {
		result = 1;
		}else if (s.equals("바위")) {   //s값이 바위와 같다면 
		result = 2;
		}else if (s.equals("보")) {
	    result = 3;
		}else {
			System.out.println("잘못된 값이 입력되었습니다.");

		System.out.println("result :"+result);
		//System.out.println("끝!!");
	}
	}
	}
	

