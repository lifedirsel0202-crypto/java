package chapter06;

import java.util.Scanner;

public class Exam6_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 두개를 입력해 주세요. >> ");
		String input = sc.nextLine();
		int[] number = new int[2];
		int result = 0;
		number[0] = Integer.parseInt(input.split(" ")[0]);
		number[1] = Integer.parseInt(input.split(" ")[1]);
		
		System.out.print("기호를 입력해 주세요. >> ");
		char input2 = sc.nextLine().charAt(0);
											//a          b       c
		Calculation cal = new Calculation(number[0], number[1], input2);  //입력받은값. 메서드작동
		result = cal.selectFuncion();  //메서드 호출
		
		System.out.printf("%d %s %d = %d", number[0],input2, number[1], result);
		
	}
}


class Calculation{
	int a;
	int b;
	char c;
	
	public Calculation(int num1, int num2, char gubun) {  //생성자 이용해서 변수값에 셋팅.
		this.a= num1;
		this.b = num2;
		this.c = gubun;
	}
	
//메소드이름  파라미터
	int selectFuncion() {   //메서드 명 
		switch (this.c) {  //실행할 문장들..
		case '+':
			return add();
		case '-':
			return minus();
		case '*':
			return sub();
		case '/':
			return div();
		default:
			return 0;   //리턴 타임   - int부터 메서드 선언
		}
		
	}
	
	int add(){
		return this.a + this.b;
	}
	
	int minus(){
		return this.a - this.b;
	}
	
	int sub(){
		return this.a * this.b;
	}
	
	int div(){
		return this.a / this.b;
	}
	
	
	
}