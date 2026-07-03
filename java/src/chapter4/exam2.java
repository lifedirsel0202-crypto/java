package chapter4;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
			
		System.out.println("--------------------");
		System.out.println("1.아메리카노(HOT)");
		System.out.println("2.아메리카노(ICE)");
		System.out.println("3.카페라테(HOT)");
		System.out.println("4.카페라테(ICE)");
		System.out.println("--------------------");
		
		Scanner Menu = new Scanner(System.in);
		int menu = Menu.nextInt();
		
		
				/* ,switch 문
				 * switch(변수){
				 * case~:
				 *   //case에 해당되면 실행할 문장
				 *   }
				 *   ##case 입력해주는 값은 변수의 자료형과 맞춰서 작성해줘야한다.
				 *   ## 각 case 들의 마지막에 break 넣어주지 않으면 중단않고 계속 진행.
				 *   ## switch문은 단순 동등비교 밖에 못함.(대소비교x)
				 */
	   int a =0;
		if ( a >=3) {
			System.out.println("ab가 3보다 크거라 같다");
		}else if (a>=5) {
			System.out.println("ab가 0보다 크거가 같다");
		} else {
			System.out.println("a는 0보다 작다!");
		}
	}
}
			
	
			
		
		



