package chapter02_02;

public class exam01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sum2 = (a + 10) + (b + 3);

		a = 50;
		sum = a + b;

		// System.out.println("sum : " + sum);

		int x = 3;
		int y = 5;
		// System.out.println(" x : " + x + " / y : " + y);

		int temp = x;
		x = y;
		// System.out.println(" x : " + x + " / y : " + y);

		y = temp;
		// System.out.println(" x : " + x + " / y : " + y);

		byte bt1 = 100;
		byte bt2 = -100;
		// byte bt3 = 128; //범위 벗어남

		short st1 = 128;
		short st2 = 30000;
		// short st3 = 100000; 범위 벗어남 ** int 제일많이 사용
		int it1 = 150000;
		int it2 = 95000000;
		// int it3 = 2200000000; //범위 벗어남

		// long ln1 = 10000000000; 크게 적은 숫자에 L 적어줘야함, int 범위보다 큰 숫자여야함.
		long Ln1 = 1000000000000L;

		char ch1 = 'a';  // 'char'는 한글자 ''(작은 따옴표) string 여러글자 "" (큰 따옴표)
		
		System.out.println("ch1 : " + ch1);
		System.out.println("a : " + a);
		
		// ** char ch2 = 'A';  이해안감.
		// System.out.println("ch2 : " + ch2);
		// System.out.println("a : " + a);

		sum = a + (int) ch1;
		System.out.println("sum : " + sum);

		//String str = "I Like apple";
		//System.out.println(str);

		//String name = "박채윤";
		//String job = "백수";

		// String str1 = "내 이름은 " + name + "이고요, \n 직업은 " + job + " 입니다.";
		// System.out.println(str1);
		
		//String str2 = "박채윤은 생각을 했습니다. 	\n	'집에 가고싶다...'";

		//System.out.println(str2); 문자끼리 +는 이어주는 역활 숫자에서 +는 더하는 역활
		

		int num1 = 10, num = 5; // 같은 타입으로 만들때 이렇게 할수 있음.
		float num2;
		num1 = 10;
		num2 = 4;

		float div = num1 / num2;
		// System.out.println(div);

		double ab1 = 3.14;
		double ab2 = 7.5;
		double absum = ab1 + ab2;

		// System.out.println(absum);

		int hour = 3;
		int minute = 5;
		// System.out.println(hour + "시간" + minute + "분");

		int totalminute = (hour * 60) + minute;
		// System.out.println("총" + totalminute + "분");

		int ch = 6 + 5;
		float ah = 0.5f;  //큰값으로 자동변환. 'float'에는 f 꼭적어줘야함.
		double ac = (ch + ah);
		// System.out.println(ac);
		
				;
		
	}
}
