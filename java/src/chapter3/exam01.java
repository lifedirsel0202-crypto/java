package chapter3;

import java.util.Scanner;
import java.util.Spliterator;

public class exam01 {

	public static void main(String[] args) throws Exception{
		/*
		 * 연산자>>
		 * a(피연산자)+(연산자)b(피연산자)
		 * 단항연산자 항이 하나인식x: a++ , !a
		 * 이항연산자     두개인식 ex: a+b , a-b
		 * 삼항영산자 항이 3개인 식  ex : x== ? a : b
		 */
		
		// 증감연산자
		int a = 100;
		int b1 = ++a;
		int b2 = a++;
		System.out.println("a : " +a);
		System.out.println("b1 :" +b1);   // 먼저 더하고 대입
		System.out.println("b2 :" +b2);   // 대입하고 더하기
		
		int x = 10;
		int y = 20;
		
		// x++ == x= x+1 전엔 ++가 속도 높다했으나 지금은 같음.
		
		int result = ++x + y--; //후위증감연산자 
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result: " + result);
		
		//논리 부정 연산자(!)
		
		boolean r = x>y;   //비교연산자 blooean은 맞다 틀리다를 저장
		System.out.println("r :" + r);
		boolean r2 = !r;   //!부정   true > false , false > true로 변경 , !!반대의 반대
		System.out.println("r2 :" + r2);
		
		
		// 이항연산자
		// 산술연산자 :  사칙연산(+,-,*,/,%) -> % 나머지계산
		int p = 15 % 4;  // int에서는 %는 15 를 4로 나눈 나머지 값구해짐. :3
		System.out.println("p:" + p);
		
		// 문자열결합연산자(문자열)  = +이지만 더하지 않고 연결의미
		
		String str = "x :"+ x + y;
		System.out.println(str);
		
		String str3 = "JDK" +  3 + 3.0;
		String str3d = "JDK" + (3 + 3.0);
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3d);
		

		//비교연산자 : == , !=(같은거에 부정) , >= , =< , > , <  / 부등호가 먼저
		boolean b = x > y;
		System.out.println("b: "+ b);
		
		String str1 = "Apple";  //str에 apple이 저장된게 아니라 str1안에는 메모리주소만 저장
		String str2 = "Apple";  // apple은 따로 메모리주소로 저장 str1과 str2은 같은 메모리주소가리킴.
		System.out.println(str1==str2); // String 안에 있는 문자가 같은건지에 사용되지 않음.//메모리주소비교
		System.out.println(str1.equals(str2));  //내용비교
		
		//String strVar1 = "Apple";
		//String strVar2 = "I like Apple";
		//String strVar3 = (" ")+[2];
		//System.out.println(split.e);
		
		
		/*
		 *  논리연산자 : && , & , ||, |  ,^ , !
		 *  논리곱 : &&,&-> (AND) 모두다 true이면 true이다.
		 */
		boolean ba  = 10<20 && 5>3;  //답이 둘다 true 이면 ba에 true 저장/둘중 하나라도 false 나오면 f	
		System.out.println(ba);
		
		
		 // 논리합 : ||,| (OR)둘중 하나라도 true 라면 true
		// ||조건에 하나만 만족해서 결과값O, | 결과값이 만족해도 둘다 확인
		boolean bb = x>=3 || y<=3;
		System.out.println("bb :" + bb);
		
		int i = 5;
		int ij =8;
		if (i % 2 == 0 || ij % 2 == 0) {  // && ==and   ,  ||== or
			System.out.println("i와 ij는 모두 짝수입니다.");
		}
		
		
		// 대입연산자 (=)
		int k = 3;
		int l = 5;
		l += k;
		System.out.println("l: "+l);
		l = l+k;
		System.out.println("l: "+l);
		
		 /*
		  * 복합대입연산자
		  * += : 더해서 대입    l= l+k
		  * -= : 빼서 대입     l= l-k
		  * *= : 곱해서 대입    l=l*k
		  * /= : 나눠서 대입하겠다 l=l/k
		  * %= : 나눈 나머지를 대입
		  */
		
		//삼항연산자 -조건문후 
		
		
	
		int var1=3;
		int var2=2;
		double var3=var1/var2;
		int var4=(int)(var3*var2);
		System.out.println(var4);
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue :" +intValue);
		
		char charValue = '가';
		int intValue1 = charValue;
		System.out.println("가의 유니코드:" +intValue1);
		
		int intValue2 = 50;
		long longValue3 = intValue2;
		System.out.println("longValue3 :" + longValue3);
		
		int ret= 69;
		char it = (char) ret;
		System.out.println(it);
		
		long re = -35656565654l;
		float its = (float) re;
		System.out.println(its);
				
		int sis = 10;
		double dou = 5.5;
		double result1 = sis +(int) dou;
		System.out.println(result1);
		
		String strs = "true";
		boolean vaca = Boolean.parseBoolean(strs);
		System.out.println(vaca);
		
		int vs = 150;
		System.out.printf("상품의가격:%d원 \n " , vs);
		System.out.printf("상품의가격:%6d원 \n " , vs);
		System.out.printf("상품의가격:%-10d원 \n " , vs);
		System.out.printf("상품의가격:%10d원 \n " , vs);
		
		
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keybord:" + keyCode);
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycord \n:"+keyCode);
			
			String name = "감자바";
			int age = 25;
			String tel1 = "010",tel2="123",tel3="4567";
			System.out.printf("이름 :"+name + "\n나이는: "+age + "\n전화는: " + (tel1 +"-" +tel2 +"-"+tel3));
			
			System.out.println("\n이름은 :" + name);
			System.out.println("나이는 :" + age);
		
			System.out.println("전화는 : "+ tel1+"-"+tel2+"-"+tel3);
			System.out.println("이름은 :"+name);
			System.out.print("나이는 :"+age);
			System.out.printf("\n전화는 :%1$S-%2$S-%3$S\n ", tel1 ,tel2, tel3) ;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("첫 번째 수:");
			String srtNum1 = scanner.nextLine();
			System.out.print("두 번째 수:");
			String srtNum2 = scanner.nextLine();
			int num1 = Integer.parseInt (srtNum1);
			int num2 = Integer.parseInt(srtNum2);
			int result3 = num1 + num2;
			System.out.println("덧셈 결과:"+result3);
			
			
		    
			
			}
	}
}
