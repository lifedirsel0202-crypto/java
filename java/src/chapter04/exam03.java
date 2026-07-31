package chapter04;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("i:" +i);
			System.out.println("계산전의 sum:"+sum);
			sum=sum+1;
			System.out.println("계산후의 sum:"+sum);
			System.out.println("--반복할 내용 끝--");
			
		}
		
		//System.out.println("i:"+i);  //for 끝나고 나면 삭제처리.
		System.out.println("sum:"+sum); //괄호안의 내용이라서 남아있다.
		
		
		String input ="";
		Scanner sc = new Scanner(System.in);
		sum = 0;	
		while (!input.equals("q")) {
//		System.out.println("계산전의 sum:"+sum);
		System.out.printf("종료하시려면 q를 입력하세요.");
		input = sc.nextLine();
		System.out.printf("input에는"+ input + "이 입력되었습니다");  //
			
		}
		
	}
}
