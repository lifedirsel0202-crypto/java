package practice01;

import java.util.Scanner;

public class TvRemoteC extends BasicRemote {		
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		TvRemoteC ac = new TvRemoteC();
		ac.select();
		
		sensor = sc.nextInt();
		switch (sensor) {
		case 2:
		System.out.println("TV 화면를 켭니다.");
		break;
	}
	}
}

