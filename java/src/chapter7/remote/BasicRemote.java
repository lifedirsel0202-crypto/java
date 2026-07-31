package chapter7.remote;

import java.util.Scanner;

public class BasicRemote {
	protected Scanner sc = new Scanner(System.in);  // protected �θ�� �ڽİ����� �����ϴ� ��л���.
	

	public void select() {
		System.out.println("===========");
		System.out.println(" 1. 에어컨 ");
		System.out.println(" 2. T  V ");
		System.out.println(" 3. 조 명 ");
		}
	boolean power = false;
	
	void powerOn() { 
		if(power =true) {
		System.out.println("전원을 켰습니다.");
	}
	}
	void powerOff() {
		if(power = false) {
			System.out.println("전원을 껐습니다.");
		}
	}

		public static void main(String[] args) {
			
		
			
		}
	}