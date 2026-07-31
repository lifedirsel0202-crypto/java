package chapter04;  //Bank

import java.util.Scanner;

public class practice0709 {
	
	public static void main(String[] args) {

		
		
		int id = 0;  //지금 만든 계좌가 몇개인지 설정.. 0개라고 setting
		int nextNo = 10001;   //계좌생성시 첫번째 계좌번호 설정.
		
		String[][] info = new String[100][3];
		Scanner sc = new Scanner(System.in);   
			
		String select = " ";
		select = sc.nextLine();
		while (!select.equals("6")) {  //select 값을 입력 받거나 5번 누르기전엔 반복
				
			System.out.println("원하는 순서 선택");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌조회");
			System.out.println("3. 입   금");
			System.out.println("4. 출   금");
			System.out.println("5. 잔액조회");

			switch (select) {

			case "1":

				System.out.println("계좌생성을 선택하셨습니다.");

				String accNo = "10-" + nextNo;

				nextNo++;     // 계좌생성할때마다. 1씩 증가

				System.out.println("계좌번호 :" + accNo);

				System.out.print("계좌사용 예금주명:");

				String name = sc.nextLine();

				System.out.println("초기입금금액:");

				String money = sc.nextLine();

				info[id][0] = accNo;   //인덱스 칸에 순서대로 저장하라는 표시.

				info[id][1] = name;

				info[id][2] = money;

				id++;   // 저장될때마다 칸을 한칸 씩 늘리라는 증감

				System.out.println("계좌생성이 완료됐습니다.");

				break;
			

			case "2":

				System.out.println("계좌잔액조회를 선택하셨습니다.");

				System.out.print("조회할 계좌번호:");

				String search = sc.nextLine();

				boolean found = false;  //found false로 지정해놓고

				for (int i = 0; i < id; i++) {

					if (info[i][0].equals(search)) {   //info[i][0].equals(search) 저장된게 search와 일치했을때.

						System.out.println("계좌번호 :" + info[i][0]);

						System.out.println("예금주명 :" + info[i][1]);
						
						System.out.println("계좌잔액 :" + info[i][2]);

						found = true;   //true일때. 실행.

						break;
					}

				}

				if (!found) {
					System.out.println("등록되지 않은 계좌입니다.");
				}

				break;

			case "3":

				System.out.println("계좌입금을 선택하셨습니다.");

				System.out.print("입금원하는 계좌입력:");

				String searchInNo = sc.nextLine();

				boolean found1 = false;

				for (int i = 0; i < id; i++) {

					if (info[i][0].equals(searchInNo)) {

						System.out.println("계좌번호 :" + info[i][0]);  

						System.out.println("현재 잔액은:" + info[i][2]);

						System.out.print("입금하실 금액:");

						String inputMoney = sc.nextLine();   

						int money1 = Integer.parseInt(info[i][2]);   // String을 int로 변환시켜서..

						int money2 = Integer.parseInt(inputMoney);

						int totalMoney = money1 + money2;    // 더한다음

						info[i][2] = String.valueOf(totalMoney);  // valueOf 문자화 시켜서...

						System.out.println("현재잔액은 : " + info[i][2] + "입니다.");

						found1 = true;

						break;
					}

				}

				if (!found1) {
					System.out.println("등록되지 않은 계좌입니다.");
				}

				break;

			case "4":

				System.out.println("계좌출금을 선택하셨습니다.");

				System.out.print("출금하실 계좌입력:");

				String searchOutNo = sc.nextLine();

				boolean found2 = false;

				for (int i = 0; i < id; i++) {

					if (info[i][0].equals(searchOutNo)) {

						System.out.println("계좌번호:" + info[i][0]);

						System.out.println("현재잔액은:" + info[i][2]);

						System.out.print("출금할 금액:");

						String outMoney = sc.nextLine();

						int mon1 = Integer.parseInt(info[i][2]);

						int mon2 = Integer.parseInt(outMoney);

						int total = mon1 - mon2;
						
						if (total<0) { System.out.println("출금 잔액이 부족합니다.");
							

						} else if (total>0) {info[i][2] = String.valueOf(total);

						System.out.println("출금이 완료됐습니다.");
						System.out.println("현재 잔액은" + info[i][2] + "입니다.");
						}	
					}
					found2 = true;

					break;
				
				}break;

				
			case "5":

				System.out.println("계좌잔액조회를 선택하셨습니다.");

				System.out.print("잔액조회할 계좌번호:");

				String searchN = sc.nextLine();

				boolean found3 = false;

				for (int i = 0; i < id; i++) {

					if (info[i][0].equals(searchN)) {
						System.out.println("현재 계좌의 잔액은" + info[i][2] + "입니다.");

						found3 = true;

						break;
					}

				}
			default:
				System.out.println("번호 다시 입력하세요.");

			}
		}
	}
}
