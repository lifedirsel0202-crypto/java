package chapter7.remote;

import java.util.Scanner;

public class AirCoditioner extends BasicRemote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AirCoditioner ac = new AirCoditioner();
		ac.powerOn();
		ac.powerOff();
		ac.temperatur();
	}


	@Override
	public void powerOn() {
		if(power =true) {
		System.out.println("에어컨전원을 켰습니다.");
	}
		
	}
	
	@Override
	public void powerOff( ) {
		if(power = false) {
			System.out.println("전원을 껐습니다.");
		}
	}
		
	
	public void temperatur() {
		 System.out.println("현재 온도를 입력하세요.");
		 int nowTemp = sc.nextInt();
		 System.out.println("원하는 온도를 입력하세요.");
		 int wantTemp = sc.nextInt();
		 if (nowTemp>wantTemp) { 
			 System.out.println("냉방을 시작합니다.");
		 } else if (nowTemp<wantTemp) {
			 System.out.println("난방을 시작합니다.");
		 }
	}
		
	}



