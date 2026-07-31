package chapter02;

import java.util.Scanner;

public class _260731 {

	public static void main(String[] args) {
		String name = "감자바";
		int age = 25;
		String tel= "010", tel2 = "1234", tel3 = "2345";
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.printf("전화번호 : %1$s-%2$s-%3$s\n",tel,tel2,tel3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = sc.nextLine();
		System.out.print("두번째 수 : ");
		String strNum2 = sc.nextLine();
		
		int num1= Integer.parseInt(strNum1);
		int num2= Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.print("뎃셈결과 : "+result);
		
		
		System.out.print("\n1. 이름 : ");
		String myName= sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		String myNum= sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String myTel= sc.nextLine();
		
	}

}
