package chae;

import java.util.Random;

public class chaey_exercise {

	public static void main(String[] args) {
		
		char c ='A';
		System.out.println("전"+c);
		System.out.println((int)c);
		
		c++;
		System.out.println(c);
		System.out.println((int)c);
		
		String[][] seats = new String[10][15];
		
//		
//		char ch = 'A';
//		for (int i=0; i<seats.length; i++) {
//			for (int j=0; j<seats[i].length; j++) {
//				seats[i][j]= String.valueOf(ch)+(j+1);
//				} ch++;
//		}
//		for (int i=0; 1<seats.length;i++) {
//			for (int j=0; j<seats[i].length; j++) {
//				System.out.print(seats[i][j]+" ");
//			}System.out.println();
		String[] food = {"떡볶이","치킨","파스타"};
		System.out.println("==친구의 최애음식==");
		for (int i=0; i<food.length; i++) {
			System.out.println((i+1+food[i]));

		}
		System.out.println("======================");
//	Random rand = new Random();
//	
//	int [] dice = {1,2,3,4,5,6};
//	
//	for (int i=1; i<dice.length; i++) {
//		System.out.print(dice[i]);
//	}
	
	String[] item = {"옷","지갑","스프레이","노트북","이어폰","비타민"};
	boolean found=false;
		for(int i=0; i<item.length; i++) {
			
			String item1=item[i];
			
			if(item1.equals("스프레이")||item1.equals("공구")) {
				
				System.out.println(item1+"이 발견됐습니다.");
				break;
			}
		}
			if(!found) { System.out.println("금지품목 없습니다.안전하게 탑승하세요");
			}
			
		String[] list = {"라이터","담배","과자","아이스크림","김치","고기","음료수"};
		boolean dangur = true;
		 	for(int i=0; i<list.length;i++) {
		 		String list1= list[i];
		 		if (list1.equals("라이터")||list1.equals("담배")||list1.equals("술")) {
		 			System.out.print(list1+"이 발견됐습니다. 압수하겠습니다.");
		 			break;
		 		} 
		 		}
		 	if(dangur) {
		 			System.out.println("가방 챙겨가셔도 됩니다.");
		 	}
		 	sayHello();
		 	sayHello();
		 	sayHello();
		 	power(2);
		 	power(3);
	}
	
	public static void power() {
		// TODO Auto-generated method stub
		
	}

	//method
	public static void sayHello() {
		System.out.println("안녕하세요. 메서드입니다.");
	}
	
	//매개변수(parameter)
	public static void power(int number) {
		// number 매개변수
		int result = number*number;
		System.out.println(number+"의 제곱은"+result+"입니다.");
	
		
	
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
	
		System.out.println("===============");
	
	
		}
	}
	
}
	
			
	





	
			
		
	


