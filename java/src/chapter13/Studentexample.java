package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.Name;

public class Studentexample {

	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<>();
		// student 객체 담길 ArrayList 생성
		// 총 학생수 입력받기.
		Scanner sc = new Scanner(System.in);
		
		info(std);
		search(std);
		inputTel(std);

	}

	static Scanner sc = new Scanner(System.in);  //이렇게 하면 공통으로 사용가능.
	
	static void info(ArrayList<Student>std) {

//		for (int i = 0; i < std.size(); i++) {
//		 System.out.println("학생수 확인 :" + std.size());
//		}		
		std.add(new Student());   // 객체 추가 할 자리 +
		
		for (int i=0; i<std.size(); i++) { //리스트에 적어둔 학생 수(i)만큼 정보를 입력받아서,,
		
		while (true){	  //이름의 규칙에 맞아서 정상 처리 될때까지 반복
			System.out.print("이름 :");
			String inputName= sc.nextLine(); //입력받은 이름을 저장할 inputName 변수 설정
			
			boolean ok= true;   // 입력갑이 정상인지 확인하는 스위치. 우선 정상으로 가정하고.
			
			for (int j=0; j<inputName.length();j++) {  //inputName에 입력된 이름에서ㅣ. 
				char c= inputName.charAt(j);   
				if (!(c>='가' && c<='힣')) {   // 한글 범위안에 하나라도 속하지 않는다면.
					ok=false;;   //  비정상으로 바꾸고
					break;      // 멈춤
				}
			}
			if (!ok) {       //입력갑싱 잘못됐다면 실행문 실행하고.
				System.out.println("이름을 다시 입력해주세요."); 
				continue;    //다시 처음올 돌아가서 이름을 다시 입력받게..
			}//정상이면 setName에  inputName 저장
			std.get(i).setName(inputName);   
		     
			
			System.out.print("성별:");
			std.get(i).setGender(sc.nextLine());
			
			System.out.print("학년 :");
			int m = Integer.parseInt(sc.nextLine());
			std.get(i).setGrade(m);

			System.out.print("반 :");
			int m1 = Integer.parseInt(sc.nextLine());
			std.get(i).setClR(m1);

			System.out.print("번호 :");
			int m2 = Integer.parseInt(sc.nextLine());
			std.get(i).setClN(m2);
			
			
			//member라는 변수에 학년 반, 번호를 새로운 문자열로 만들어는 Sting.format 사용.해서 저장
			String member = String.format("%02d%02d%02d", m, m1, m2); 
			std.get(i).setInfoId(member);  // setInfoId 에 member 를 저장

			System.out.println(std.get(i).getName() + "님의 학번:" + std.get(i).getInfoId() + "입니다.");
			
		break;
			// 객체 저장돼있는지 확인
//			int size = std.size();
//			System.out.println(size+"명");
		// return 반환 그리고 메서드 끝.
		}
		}
	}
	
	static void search(ArrayList<Student>std) { 
		
			System.out.print("조회할 학번입력 : ");  //학번입력받아...
			String fineId = sc.nextLine();
			boolean found= false;
			while(true) {
				
			for (int i=0; i<std.size(); i++) {
				String ab = std.get(i).getInfoId();
				
				if(ab.equals(fineId)){
					
					System.out.println("학년 :" +std.get(i).getInfoId());
					System.out.println("이름 :" +std.get(i).getName());
					System.out.println("성별 :" +std.get(i).getGender());
					
					found=true;
					break;
				
				} 
			}
				if (!found) { System.out.println("다시 입력해주세요");
			}
				break;
	} 
	}
	
	
	static void inputTel (ArrayList<Student>std) {
		while (true) {
			boolean fine = false;
		
			for (int i=0; i<std.size(); i++) {
			System.out.print("학번 입력: ");
			String id = sc.nextLine();
			
			String reId = std.get(i).getInfoId();  
			
			if (reId.equals(id));{
			System.out.println("연락처를 입력하세요.");
			String newPhone = sc.nextLine();
		
			std.get(i).setPhone(newPhone);
			System.out.println(std.get(i).getName()+"님의 연락처"+std.get(i).getPhone() + "저장했습니다.");
			 fine =true;  // 연락처 찾았으니 true 로 바꾸고.
			 break;   
			 
				} 
			}
	
	}
	}
}
	


