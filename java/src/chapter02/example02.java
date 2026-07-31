package chapter02;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {

		                                          //예외생기면 넘긴다는 뜻

			 /**  기본타입
			  * 정수형
			   *  byte :1byte -> 256가지 -> -128~127
			   *  short : 2yte -> 65536 -> -32768~32767
			   *  int : 4byte => 2의 32승 
			   *  long : 8byte ->2의 64제곱 (int범위 벗어난 숫자 L표시)
			   *  문자형
			   * *char(문자형) : 2byte(유니코드) ->65536가지 ->0~6535 ''
			   * 실수형
			   * float :4 byte (소수점 사용시 f 표시)
			   * double : 8byte
			   * 
			   **클래스타입 (기본타입x)
			   * string :문자열 (크기x) ""
			   */
				/*
				 * *논리형
				 * bloolean : 2가지 종류의 값 (true / false)
				 */
				int a = 10 , b = 5;
				boolean result = a < b;
				System.out.println(result);
				
				// 타입변환
				int num1 ;
				short num2 = 10;
				num1 = num2;
				System.out.println(num1);  //자동형변환 작은->큰
				
				num1 = 50;
				num2 = (short)num1;   // 강제형변환 큰-> 작은
				// 작은-------------------------------------------------큰타입
				// byte < short(char) < int < long < float < double
						
				char ch = 'A';
				int num3 = ch;
				//System.out.println("num3 : " + num3);
				
				byte bt1 = 10 , bt2 = 20;
				//System.out.println("bt1 : " + bt1 +  " / bt2 : " + bt2);
				
				byte btsum = (byte)(bt1 + bt2);  //byte끼리 더하면 int 로 인식
				//System.out.println(btsum);
				
				// 100p 예제 
				byte value1 =10;
				int value2 = 100;
				long value3 = 1000L;
				 //        byte  +  int   + long  자동으로 큰그릇으로 변환
				long sum = value1 + value2 + value3;  //그래서 int는 오류//  int보다 작은타입은 int에 맞춰지고, 
				                                     // int보다 큰타입은 제일 큰 타입에 기준 맞춘다
				 System.out.println(sum);
				
				System.out.println("result : " + value1 + value2 + value3);//문자열에 더하면 연결
				System.out.println("result : " + (value1 + value2 + value3)); //() 묶어줘야 숫자로 인식
				
				//println= line 한줄 사용후 행변환
				//print = 행변환 없이 이어서 \n 입력따로 해줘야 행변환
				// printf= f > format (형식) -- 형식지정자?? %d(정수), %f(실수), %s(문자열), %c(문자)...
				System.out.printf("printf result : %d\n" , value1 + value2 + value3);
				
				// System.out.printf("printf result :"%d %d  %d" , value1 , value2 , value3);
				
				String st1 = "My name is";
				String name = "chaeyoon";
				String st2 = "and I'm";
				int age = 20;
				String st3 = "years old";
				System.out.printf("%s %s %s %d%s\n" , st1 , name , st2 , age , st3 ) ;

				
				String st4 = "Hi, My name is Chae Yoon";
				String meet = "Nice to meet you";
				String age1 = "I'm ";
				int st5 = 40;
				String st6 = "yesrs old";
				System.out.printf("%s %s %s %d%s" , st4 , meet , age1 , st5 , st6);
						
				//_ _ _ _ _ _ 1 2 3
				System.out.printf("%10d\n", 123);
				System.out.printf("%10d\n", 12345);
				System.out.printf("%10d\n", 1234567);
				System.out.printf("%10d\n", 1234);
				System.out.printf("%10d\n", 123456);
				
//				//int keycode =  System.in.read();
//				System.out.printf("keycode : %c\n", keycode);
//				System.out.println("keycode : " + keycode); //한번에 주석 블럭+ ctrl+/
//				//한글인식 못함??
				
				//클래스  변수             메소드
				
				//한글받을때...맨 윗줄에 import scanner 입력돼있어야..
				Scanner scanner =  new Scanner(System.in);
				String inputName = scanner.nextLine();  //nextLine- 메소드
				System.out.println(inputName);  // println -메소드
				
				long var = 10;
				long var1 = 20;
				long var2 = 1000000000000l;
				System.out.println(var);
				System.out.println(var1);
				System.out.println(var2);
				
				int kka = 5152031;
				int hana = 530000;
				int woo = 730000;
				
				System.out.printf("%d %d %d \n" , kka , hana , woo);
				
				System.out.println(kka - hana - woo);
				
			
			}
	}

