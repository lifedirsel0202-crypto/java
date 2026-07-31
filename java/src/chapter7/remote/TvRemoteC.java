package chapter7.remote;

import java.util.Scanner;

public class TvRemoteC extends BasicRemote {		
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		TvRemoteC ac = new TvRemoteC();
		ac.powerOn();
		ac.powerOff();
		ac.channel();
	}
	@Override
	void powerOn() {
		if(power =true) {
		System.out.println("TV 전원을 켰습니다.");
	}
		
	}
	@Override
	void powerOff() {
		if (power =false) {
			System.out.println("TV 전원을 끕니다.");
		}
		
		
	}
	
	int no = 50;
	void channel() {
		System.out.println("채녈 :" + no);
		System.out.println("원하는 채널입력하세요");
		int wantNo = sc.nextInt();
		for (int i=1; i<no; i++) {
			if (wantNo<no) { i--;
				System.out.println("채널:" + wantNo +"이동"); 
		
			}if (i>wantNo) { System.out.println("채널:" + i +"이동" );
			
			}if (i==wantNo) {System.out.println("현재 채널:" +i+"입니다");
		}
		
	}
	}

}
