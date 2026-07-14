package chae;

import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("presentyyyy:");
		int pY = scanner.nextInt();
		System.out.print("mm:");
		int pM = scanner.nextInt();
		System.out.print("dd:");
		int pD = scanner.nextInt();
		System.out.print("birthdayyyy:");
		int bY = scanner.nextInt();
		System.out.print("mm");
		int bM = scanner.nextInt();
		System.out.print("dd");
		int bD = scanner.nextInt();
		int M2 = (pY - bY), M1=(pY - bY-1);
//		for (int i = 1; pM < bM; re++) {
//			System.out.println("당신의 만나이" + (re) + "입니다.");
//			break;
//		}
//		for (int i = 1; pM > bM; re--) {
//			System.out.println("당신의 만나이" + (re - 1) + "입니다");
//			break;
		
		if (pM>bM) { System.out.println("당신의 만나이는"+M2+"세 입니다.");}
		else if (pM<bM) {System.out.println("당신의 만나이는"+M1+"세 입니다.");}
		
		int[] num = new int[10];
		// 100칸짜리 방을 만들어 놓는것, 다른 타입은 사용할수 없음.
		
		
			}
		
			
	}
	

