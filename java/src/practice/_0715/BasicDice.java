package practice0715;

import java.util.Random;   //파라미터로 불러온 랜덤과 스캐너를 사용하기위해 등록.
import java.util.Scanner;

public class BasicDice implements Base {  // base에 만들어논 setDice 규칙 

	String name;  //주사위 이름과, 눈을 필드설정 
	int [] list; 

	@Override
	public void setDice(String name, int[] list) {
		this.name = name;
		this.list = list; // name과 list 를 저장할 상자
	} 

	void makeBox(BasicDice[] box) {    //메인에 만들어진 box상자를 파라미터로 받아서 사용

		box[0] = new BasicDice(); // 메인에서 받아온 bpx 상자에 순서대로 배열저장  
		box[0].setDice("원조주사위", new int[] { 1, 2, 3, 4, 5, 6 });  //setDice로 이름과 list기능써서 이름붙여준것
		box[1] = new BasicDice();
		box[1].setDice("극단주사위", new int[] { 1, 1, 1, 1, 6, 6 });
		box[2] = new BasicDice();
		box[2].setDice("석사주사위", new int[] { 3, 3, 3, 4, 4, 4 });
		box[3] = new BasicDice();
		box[3].setDice("오이주사위", new int[] { 2, 2, 2, 5, 5, 5 });  //이렇게 하면 나중에 주사위 추가하거나 수정할때
	}                                                              // 편하게 사용할수있음
	
	void gameS(BasicDice[] box, Scanner sc, Random r) { // 메서드 지정하고 메인에 만들어논 상자랑 스캐너, 랜덤기능을 사용,import 입력

		System.out.println("rule: p1 주사위 랜덤으로 지정\n      p2 원조주사위를 사용");
		System.out.println("☆----------------------------☆");

		BasicDice myDice = box[r.nextInt(4)]; // p1주사위은 box안의 주사위 4개중 랜덤배정
		BasicDice uDice = box[0]; // 컴퓨터 주사위 원조주사위로 고정

		System.out.print("p1 당신의 주사위는? 두구두구.. ▷ Enter!!");
		sc.nextLine();
		System.out.print("☆--["+ myDice.name+"]--☆게임을 시작합니다☆--☆\n");
		sc.nextLine();
		
		int mySum = 0, uSum = 0, count =0;  //합계와 count 0으로 선언.
		
		while (mySum <= 1000 && uSum <= 1000) { // while 문으로 총점 1000점 될때까지 반복
			
			count++;         // 라운드별로 카운드 기능+
			
			System.out.println("       Round [["+count+"]]\n");
			
			System.out.print("☞ p1 Turn ☆ : ");
			
			int a1 = myDice.list[r.nextInt(myDice.list.length)]; // 주사위 3개 굴려 각 a1~a3까지 저장
			int a2 = myDice.list[r.nextInt(myDice.list.length)];
			int a3 = myDice.list[r.nextInt(myDice.list.length)];
			mySum += a1 + a2 + a3;
			System.out.println(myDice.name +":"+ a1 +"+"+ a2 +"+"+ a3 +"= 현재"+ mySum +"점");
			if (mySum == 1000)
				break; // 총점이 1000점보다 크거나 작으면 stop
				
			System.out.print("☞ p2 Turn ☆ : ");

			int b1 = uDice.list[r. nextInt(uDice.list.length)]; 
			int b2 = uDice.list[r.nextInt(uDice.list.length)];
			int b3 = uDice.list[r.nextInt(uDice.list.length)];
			uSum += b1 + b2 + b3;
			System.out.println(uDice.name +":"+ b1 +"+"+ b2 +"+"+ b3 +"= 현재"+ uSum +"점\n");
			if (uSum == 1000)
				break;
				
		}
		System.out.print("        [[최종 우승자는 ?]] ");
		sc.nextLine();
		System.out.println("Player p1:" + mySum + "점  ||  Player p2:" + uSum + "점");
		System.out.println(mySum >= 1000 ? "	☆------- p1 win -------☆" : "	☆------- p2 win -------☆");

	}
}
