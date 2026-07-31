package chae;

import java.util.Random;
import java.util.Scanner;

public class qa {



	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
//		System.out.printf("숫자입력");
//		Double num1= Double.parseDouble(sc.nextLine());
//		System.out.printf("기호입력");
//		String cal= sc.nextLine();
//		System.out.printf("숫자입력"); 
//		Double num2= Double.parseDouble(sc.nextLine());
//		
//		if (cal.equals("+")){ System.out.printf("결과: %-2f\n ", num1+ num2 );}
//		else if (cal.equals("-")) {System.out.printf("결과: %-2f\n" , num1-num2);}
//		else if (cal.equals("*")) {System.out.printf("결과: %-2f\n" , num1*num2);}
//		else  { System.out.printf("결과 : %2f\n", num1/num2);}		
//		
//		int score = 93;
//		if (score>=90)  {System.out.println("점수가 90보다 큽니다.");
//		 System.out.println("등급은 A입니다.");
//		if (score<90) System.out.println("점수가 90보다 작습니다.");
//		 System.out.println("등급은 B입니다");}
//		
	
//		int count = sc.nextInt();
//		if (count<=0) {System.out.println("0보다 큰 수를 입력하세요");}
//		
//		int first = 1, second = 1;
//		System.out.println("피보나치수열");
//		for(int i=1; i<=count; i++) { System.out.println(first );
//		int next = first+second;
//		first = second;
//		second = next;}
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("숫자입력");
//		int nn= sc. nextInt();
//		int num = (int) (Math.random()*6) + 1;
//		if (num==1) {System.out.println("1번입니다");}
//		else if(num==2) {System.out.println("2번입니다");}
//		else if(num==3) {System.out.println("3번입니다");}
//		else if(num==4) {System.out.println("4번입니다");}
//		else if(num==5) {System.out.println("5번입니다");}
//		else if(num==6) {System.out.println("6번입니다");}
		
//		int x= 5;
//		int y=5;
//		int max= (x>y) ? x:y;       //false이므로 뒤에 있는 y를 max에 저장 
//		System.out.println(max);
//		int min = (y>x)  ? x: y;   //true 이므로 앞에 있는 x를 저장
//		
//		System.out.println(min); 
//		
//		boolean b= (x==y) ? true : false;
//		System.out.println(b);
//		String s = (x != y) ? "달라요": "같아요";
//		System.out.println(s);             //답이 다른것에 반대 false 이므로 true 가 되서 반대 false 저장? 
//		
//		int a = 68;
//		int bb = 75;
//		int c = 72;
//		
//		int tempMaxWight= (a>bb) ? a:bb;
//		int LowWight= (tempMaxWight>c) ? tempMaxWight:c;
//		System.out.println("꼴지의 몸무게는"+LowWight+"입니다.");
//		
//		
//		int qq = 75;
//		int ww = 65;
//		int ee= 80;
//		int temp = (qq>ww) ? qq:ww;
//		int low= (temp>ee) ? temp:ee;
//		System.out.println("당신의 몸무게는"+low+"입니다");
//		
//// 쇼핑몰에서 상품 주문하고 할인혜택 및 최종 결제금액 계산.
//		
//		int price = 30000;
//		int coupon = 5000;
//		
//		int totalPrice = price - coupon;
//		
//		boolean applyFreeShopping = totalPrice>20000? true: false;
//		
//		System.out.println("최종결제금액:"+totalPrice);
//		System.out.println("무료 배송 여부: " +applyFreeShopping);
//		
//		String ll= "I like Java and Pyton and C.";
//		
//		System.out.println(ll);
//		System.out.println(ll.length());
//		System.out.println(ll.toUpperCase());
//		System.out.println(ll.toLowerCase());
//		
//		System.out.println(ll.contains("Java"));
//		
//		System.out.println(ll.indexOf("Java"));
//		System.out.println(ll.lastIndexOf("C#"));
//		System.out.println(ll.indexOf("java"));
//		System.out.println(ll.lastIndexOf("Pyton"));
//		System.out.println(ll.startsWith("Like"));
//		System.out.println(ll.startsWith("I"));
//		System.out.println(ll.endsWith("like"));
//		System.out.println(ll.endsWith("."));
//		
//		int v1=15;
//		if (v1>10) {
//			int v2;
//			v2=v1-10;
//		}
//		//int v3=v1+v2+5;
//		int m1=0;
//		if (true) {int m2=0;
//		if (true) {int m=0;
//		m2=1;
//		m1=1;
//		m=1;
//		}
//		//m1=m2+m;  m은 {}괄호 범위 벗어나 사라짐.
//		} System.out.println(m1);
//		
//		int var1= 0b1011;  //2진수
//		int var2= 0206;;   //8진수
//		int var3= 365;     //10진수
//		int var4= 0xB3;    //16진수
//		
//		System.out.println("var1:" +var1);
//		System.out.println("var2:" +var2);
//		System.out.println("var3:" +var3);
//		System.out.println("var4:" +var4);
//		
//		char b1= 'A';
//		int b2= 'A';
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b1+b2);  //int로 자동변환되서 계산됨.
//		System.out.println((char)(b1+b2));  //int로 자동변환되서 계산됨.
//		System.out.println((char)130);
//		
//		char cc='A';
//		char ca=65;
//		char cs='\u0041';
//		
//		char cz='가';
//		char cv=44032;
//		char cb='\uac00';
//		
//		System.out.println(cc);  //문자저장
//		System.out.println(ca);  //10진수저장
//		System.out.println(cs);  //16진수저장
//		System.out.println(cz);  //문자저장
//		System.out.println(cv);  //10진수저장
//		System.out.println(cb);  //16진수저장
//		
//		float var6 =3.14f;
//		double var7= 3.14;
//		
//		float var8= 0.1234567890123456789f;
//		double var9 = 0.1234567890123456789;
//		
//		System.out.println("var6:"+var6);
//		System.out.println("var7:"+var7);
//		System.out.println("var8:"+var8);  //var8:0.12345679
//		System.out.println("var9:"+var9);  // var9:0.12345678901234568 float type보다 2배이상 정밀하게 출력
//		
//		double var10=3e6;
//		float var11=3e5F;
//		double var12= 4e-5;   // 0.004
//		System.out.println(var10);  //3000000.0  //소수점 위로 e6 여섯개
//		System.out.println(var11);  //300000.0   //e 다음숫자에 따라 소숫점 자리 
//		System.out.println(var12);  //0.002      // -e3 소수점 아래로 
//		
//		System.out.printf("%10.2f%n",4e-10);
//		
//		double i= 1.3;
//		double j= 2.0;
//		int result =(int)i *(int)j;
//		System.out.println(result);
//		
//		int vlaue = 123;
//		System.out.printf("상품의가격은:%d원\n",  vlaue);
//		System.out.printf("상품의 가격은:%6d원\n", vlaue);
//		System.out.printf("상품의 가격은:%-6d원\n", vlaue);
//		System.out.printf("상품의 가격은:%05d원\n", vlaue);
//		
//		double area= 3.14159*10*10;
//		System.out.println(area);
//		System.out.printf("반지름이 %d인 원의 넓이는:%10.2f\n",10,area);
//		
//		String name="홍길동";
//		String job="도적";
//		System.out.printf("%6d | %-10s | %10s\n", 1 , name , job);
//		
//		
//		int keycode;
//		keycode =System.in.read();
//		System.out.println("keycode:"+keycode);
//		
//		keycode =System.in.read();
//		System.out.println("keycode:"+keycode);
//		
//		
//		while(true) {
//			keycode =System.in.read();
//			System.out.println("keycode:"+keycode);
//			if (keycode==65) {
//				break;
//			}
//			
//		}System.out.println("종료");
		
//		String input;
//		while (true) {
//			input = sc.nextLine();
//			System.out.println("입력된 문자열: \""+input+"\"");
//			if (input.equals("q")) {
//				break;
//			}
//}
//		 System.out.println("종료");
//		


		
//		System.out.print("첫번째 수:");
//		String ne= sc.nextLine();
//		System.out.print("두번째 수:");
//		String nee = sc.nextLine();
//		int num1= Integer.parseInt(ne);
//		int num2= Integer.parseInt(nee);
//		
//		int sum = num1+num2;
//		String ab= String.valueOf(sum);
//		
//		
//		System.out.println(sum);
		//int sum1 =ab;   //vlaueOf 문자열 변환으로 int a 에 대입안됨.
//		
//		String name0 = "감자바";
//		int age1= 25;
//		String tel1 = "010",tel2 = "2354", tel3= "5678";
//		System.out.println("이름은: "+ name0);
//		System.out.print("나이:"+age1);
//		System.out.printf("\n전화번호는 : %1$s-%3$s-%2$s",name0,tel1,name0);
//		System.out.println();
//		
//		int score = 85;
//		char grade = (score>90)? 'A':((score>80)? 'B' : 'C');
//		
//		System.out.println(score + "점은" + grade + "등급니다.");
//		
//		byte n= 5;
//		n= (byte) -n;  // n=-n 은 연산자 붙으면 무조건 int로 인식, 형변환해줘야. 계산가능
//		int re = 10/n;
//		System.out.println(result);
//		
//		int xx=10;
//		int yy = 20;
//		int zz= (++xx) + (yy--);
//		System.out.println(zz);
//		System.out.println(yy);
//		
//		boolean stop = true;
//		while (stop) {System.out.println("멈추세요");
//		break;
//		
//		
//		}
//		int pencil = 534;
//		int person = 30;
//		
//		int pensp = pencil/person;
//		System.out.println(pensp);
//		int penss= pencil%person;
//		System.out.println(penss);
//		
//		int var1q=5;
//		int var2q=2;
//		double var3q = (double)var1q/var2q;
//		int var47 = (int) (var3q*var2q);
//		double var4q = (double)(var1q/var2q);
//		double var6q = var1q/var2q;
//		System.out.println(var4q);  // 2.0  int 계산후 double로 변환되서 대입
//		System.out.println(var3q);  // var1q는 double로 형변환되서 계산 5.0/2 해서 2.5
//		System.out.println(var47);  // var1이 duble 형식으로 변환되서 2.5대입돼있기때문에 2.5*2 답은 5
//		System.out.println(var6q);  // int 계산으로 2 하고 형변환되서 2.0 이미 소수점 버려진상태로..double전환 
//		
//		int va=356;
//		System.out.println(va-56);
//		System.out.println(va/100*100);
		//정수 나눔의 규칙을 이용한.. 356를 100으로 나누면 3 이되고 그걸 100으로 곱하면 300
		//ex 1236을 100으로 나누면 12 곱하면 1200
		// 56을 100으로 나누면 0 *100 은 0
//		
//		float varqq= 10f;
//		float vqrq= varqq/100;
//		if (vqrq==0.1) {System.out.println("10%입니다.");
//		}else { System.out.println("10%아닙니다.");
//		} // int 100은 float로 자동형변환되서 계산하고, 소수점은 double,float는 정확하게 저장되지 않아
//		// ==이라는 부호 사용하면 x 
//		
//		
//만약 식을 구하고 싶다면 int 형태로 계산해서 , 답을 구해야함.
		//방법 1
//		int varqq=10;
//		int result =varqq*10/100; // 10*10=100 -> 100/100 = 1
//		if (result==1) { System.out.println("10%입니다.");
		
		//방법 2
//		float varqb= 10f;
//		float vqrqb= varqq/100;
//		//Math.abs(vqrqb-0.1) 마이너스 부호빼고 양수 절대값을 만드는것.
//		if (Math.abs(vqrqb-0.1)<0.000001) {System.out.println("10%입니다.");
//		}else { System.out.println("10%아닙니다.");
//		
		/*
		 * int lengthTop = 5; int lengthBottom = 10; int height = 7;
		 * 
		 * double ard = (lengthTop + lengthBottom) *height /2.0;
		 * 
		 * 
		 * System.out.println("ard:"+ard);
		 * 
		 * System.out.println("===================="); System.out.print("첫번째 수:");
		 * double num1= Double.parseDouble(sc.nextLine()); System.out.print("두번째수 :");
		 * double num2= Double.parseDouble(sc.nextLine()); if (!(num2==0.0)) {
		 * System.out.println(num1+num2); }else {System.out.println("무한대");
		 * 
		 * 
		 * } System.out.print("첫번째수"); int num =Integer.parseInt(sc.nextLine());
		 * System.out.println("두번째수"); int mun=Integer.parseInt(sc.nextLine()); if
		 * (!(mun==0)) {System.out.println(num+mun); //num!=0과 같은 뜻. // 이렇게 하는 이유는 바깥괄호는
		 * if의 규칙, 아쪽괄호는 비교를 묶어두는 괄호. //안쪽 먼저 계산하고 !아닐경우로 해석 -> mun==0이 아닐경우 //괄호 안쓰고
		 * (!num==0) >는 참/거짓 불린에 쓰는건데 정수에 붙이니까 아예오류 // (!num)==0으로 이해해서 num을 부정하고 그결과가
		 * 0?으로 해석. }else {System.out.println("바보"); } System.out.println("첫번째수");
		 * double m = Double.parseDouble(sc.nextLine()); System.out.println("두번째수");
		 * double n =Double.parseDouble(sc.nextLine()); if (n!=0) {
		 * System.out.println(m+n); }else {System.out.println("바보");}
		 * 
		 * int z=10, x=3, c=14; String a=String.valueOf(x); String l=String.valueOf(c);
		 * 
		 * String oo= "x"+"."+l; int aa= Integer.parseInt(oo); String bb= z*z*x+oo;
		 * 
		 * 
		 * System.out.println("원의 넓이는:"+z*z+aa);
		 */
				
//				boolean run = true;
//				int balance = 0;
//				while (run) {
//					System.out.println("------------------------------");
//					System.out.println("|1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
//					System.out.println("------------------------------");
//					System.out.println("원하는 목록을 선택하세요.");
//					
//				int menu = Integer.parseInt(sc.nextLine());
//				
//				switch (menu) {
//				case 1 : 
//					System.out.println("입금 원하는 금액을 입력하세요.");
//					balance+= Integer.parseInt(sc.nextLine());
//					
//					System.out.println(balance + "입금이 완료됐습니다.");
//					
//					break;
//					
//				case 2 :
//					System.out.println("출금원하는 금액을 입력하세요.");
//					
//					
//					balance-= Integer.parseInt(sc.nextLine());
//					
//					
//					System.out.println("현재잔액은"+balance+"입니다.");
//					 
//					break;
//					
//				case 3:
//					System.out.println("현재 잔고는"+balance+"원");
//					
//					break;
//					
//				case 4 :
//					run= false;
//					
//					
//					} System.out.println("프로그램 종료");
//				
//				} 
//					
				
				boolean run1= true;
				
				int studentNum = 0;
				int[] scores = null;
				
				
				
				while (run1) {
					System.out.println("--------------------");
					System.out.println("1.학생수 || 2.점수입력 || 3.점수리스트 || 4. 분석 || 5. 종료");
					System.out.println("---------------------");
					System.out.println("선택 >");
					
					int seletNumber = Integer.parseInt(sc.nextLine());
						
					if (seletNumber==1) {
						studentNum  = Integer.parseInt(sc.nextLine());
						System.err.println(studentNum);
						
					} else if(seletNumber==2) {
						for (int i=0; i<scores.length; i++) {
							
							int[] scores1 = new int[i];
							scores1[i] = Integer.parseInt(sc.nextLine());
							System.out.println(" scores <" + i + ">");							
						}
						
					} else if(seletNumber==3) {
						
						
						
					}
				}
				
		}
}

	







		