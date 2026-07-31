package chae;

import java.util.Random;
import java.util.Scanner;


public class makeDice implements DiceBase {

	String name;
	int[] list;

	@Override
	public void setDice(String name, int[] list) {
		this.name = name;
		this.list = list;

	}

	
	

	void DiceSetting(makeDice[]room,Scanner sc, Random r) {
		room[0] = new makeDice();
		room[0].setDice("원조주사위", new int[] { 1, 2, 3, 4, 5, 6 });
		
		room[1] = new makeDice();
		room[1].setDice("띠옹주사위", new int[] { 1, 1, 1, 4, 5, 6 });
		
		room[2] = new makeDice();
		room[2].setDice("오이주사위", new int[] { 2, 5, 2, 5, 2, 5 });
		
		room[3] = new makeDice();
		room[3].setDice("석사주사위", new int[] { 3, 4, 3, 4, 3, 4 });
		
		room[4] = new makeDice();
		room[4].setDice("사이주사위", new int[] { 4, 2, 4, 2, 4, 2 });
		
		
		System.out.println("각 플레이어의 주사위를 고릅니다.");
		sc.nextLine();

		makeDice my = room[r.nextInt(5)];
		makeDice u = room[r.nextInt(5)];
		
		System.out.println("p1의 주사위: "+my+ "p2의 주사위: "+u);
		
		System.out.println("게임 시작 enter");
		sc.nextLine();
		
		int myS =0, uS=0, count=0;
		
		while (myS>=1000 && uS>=1000) {
			count++;
			
		System.out.println("p1 turn");
		System.out.println("Round: "+count);
		
		int a1=my.list[r.nextInt(my.list.length)];
		int a2=my.list[r.nextInt(my.list.length)];
		int a3=my.list[r.nextInt(my.list.length)];
		
		myS= a1+ a2+a3;
		System.out.println(my.name+":"+ a1+"+"+a2+"+"+a3+" 현재score="+myS);
		if (myS>=1000) 
			break;
		System.out.println("p2 turn");
		
		int b1=u.list[r.nextInt(u.list.length)];
		int b2=u.list[r.nextInt(u.list.length)];
		int b3=u.list[r.nextInt(u.list.length)];
		
		uS= b1+b2+b3;
		System.out.println(u.name+":"+ b1+"+"+b2+"+"+b3+" 현재score="+uS);
		if (uS>=1000)
			break;
		
	}
	}

}


